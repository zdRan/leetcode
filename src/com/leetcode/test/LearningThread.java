package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 学习多线程时的笔记
 * Create by Ranzd on 2021-03-17 17:33
 *
 * @author cm.zdran@foxmail.com
 */
public class LearningThread {
    static int count = 0;
    volatile static boolean success = false;

    public static void func1() throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }

        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        });

        t1.start();
        t2.start();

        //等待两个线程执行结束
        Thread.sleep(1000);
        System.out.println(count);
    }

    static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void func2() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicCount.getAndAdd(1);
            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicCount.addAndGet(1);
            }
        });

        t1.start();
        t2.start();

        //等待两个线程执行结束
        Thread.sleep(1000);
        System.out.println(atomicCount.get());
    }

    public static void func3(Thread thread) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1,run");
            LockSupport.park("t1");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t1 park " + LockSupport.getBlocker(thread).toString());
            LockSupport.unpark(thread);
            System.out.println("t1,run end");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2,run");
            LockSupport.park("t2");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t2 park " + LockSupport.getBlocker(t1).toString());
            LockSupport.unpark(t1);
            System.out.println("t2,run end");

        });
        Thread t3 = new Thread(() -> {
            System.out.println("t3,run");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t3 park " + LockSupport.getBlocker(t2).toString());
            LockSupport.unpark(t2);
            System.out.println("t3,run end");

        });
        t3.start();
        Thread.sleep(100);
        t1.start();
        t2.start();

    }

    public static ReentrantLock reentrantLock = new ReentrantLock(true);

    public static void func4() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            reentrantLock.lock();
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            reentrantLock.unlock();

        });
        Thread t2 = new Thread(() -> {
            reentrantLock.lock();
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            reentrantLock.unlock();
        });

        t1.start();
        t2.start();

        //等待两个线程执行结束
        Thread.sleep(1000);
        System.out.println(count);
    }

    static Condition c1 = reentrantLock.newCondition();
    static Condition c2 = reentrantLock.newCondition();

    public static void func5() throws Exception {
        Thread t1 = new Thread(() -> {
            reentrantLock.lock();
            System.out.println("t1,run");
            try {
                c1.await();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            reentrantLock.unlock();
            System.out.println("t1,run end");
        });
        Thread t2 = new Thread(() -> {
            reentrantLock.lock();
            System.out.println("t2,run");
            try {
                c2.await();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            c1.signal();
            reentrantLock.unlock();
            System.out.println("t2,run end");
        });

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantLock.lock();
            System.out.println("t3,run");
            for (int i = 0; i < 10000; i++) {
                count++;
            }

            System.out.println("t3 sleep end");
            c2.signalAll();
            reentrantLock.unlock();
            System.out.println("t3,run end");
        });
        t3.start();
        Thread.sleep(200);
        System.out.println("func5 sleep end");
        t1.start();
        t2.start();


    }

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void func6() {
        Thread t1 = new Thread(() -> {
            readWriteLock.readLock().lock();
            System.out.println("t1 read = " + count);
            readWriteLock.readLock().unlock();

            readWriteLock.writeLock().lock();
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            readWriteLock.writeLock().unlock();

        });
        Thread t2 = new Thread(() -> {
            readWriteLock.writeLock().lock();
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            readWriteLock.writeLock().unlock();
            readWriteLock.readLock().lock();
            System.out.println("t2 read = " + count);
            readWriteLock.readLock().unlock();

        });

        t1.start();
        t2.start();
    }

    static ReentrantReadWriteLock rrwLock = new ReentrantReadWriteLock();

    public static void func7() {
        Thread t1 = new Thread(() -> {
            rrwLock.readLock().lock();
            System.out.println("t1 read lock");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            rrwLock.readLock().unlock();
            System.out.println("t1 read unlock");
        });
        Thread t2 = new Thread(() -> {
            rrwLock.writeLock().lock();
            System.out.println("t2 write lock");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            rrwLock.writeLock().unlock();
            System.out.println("t2 write unlock");
        });
        Thread t3 = new Thread(() -> {
            rrwLock.readLock().lock();
            System.out.println("t3 read lock");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            rrwLock.readLock().unlock();
            System.out.println("t3 read unlock");
        });
        t1.start();
        t2.start();
        t3.start();
    }

    static CountDownLatch downLatch = new CountDownLatch(5);

    public static void func8() {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 run");
            downLatch.countDown();
            System.out.println("t1 run end");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2 run");
            downLatch.countDown();
            System.out.println("t2 run end");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("t3 run");
            downLatch.countDown();
            System.out.println("t3 run end");
        });
        t1.start();
        t2.start();
        t3.start();
    }

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
        @Override
        public void run() {
            System.out.println("cyclicBarrier run ");
        }
    });

    public static void func9() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1 run" + i);
                try {
                    Thread.sleep(300);
                    System.out.println("t1 num " + "i=" + i + ":" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 run end" + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t2 run" + i);
                try {
                    Thread.sleep(200);
                    System.out.println("t2 num " + "i=" + i + ":" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();

                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 run end" + i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t3 run" + i);
                try {
                    Thread.sleep(300);
                    System.out.println("t3 num " + "i=" + i + ":" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 run end" + i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t4 run" + i);
                try {
                    Thread.sleep(400);
                    System.out.println("t4 num " + "i=" + i + ":" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t4 run end" + i);
            }
        });
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t5 run" + i);
                try {
                    Thread.sleep(500);
                    System.out.println("t5 num " + "i=" + i + ":" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t5 run end" + i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static Semaphore semaphore = new Semaphore(1);

    public static void func10() {
        Thread t1 = new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 run");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t1 run end");
            semaphore.release();
        });
        Thread t2 = new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 run");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t2 run end");
            semaphore.release();
        });
        Thread t3 = new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3 run");
            for (int i = 0; i < 10000; i++) {
                count++;
            }
            System.out.println("t3 run end");
            semaphore.release();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public static Phaser phaser = new Phaser() {
        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            System.out.println("phase:" + phase + ",registeredParties:" + registeredParties);
            return super.onAdvance(phase, registeredParties);
        }
    };

    public static void func11() {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 run");
            phaser.register();
            for (int i = 0; i < 10000; i++) {
                phaser.arriveAndAwaitAdvance();
                count++;
                System.out.println("t1:" + i);
            }
            System.out.println("t1 run end");
            phaser.arriveAndDeregister();
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2 run");
            phaser.register();
            for (int i = 0; i < 10000; i++) {
                phaser.arriveAndAwaitAdvance();
                count++;
                System.out.println("t2:" + i);
            }
            System.out.println("t2 run end");
            phaser.arriveAndDeregister();
        });
        Thread t3 = new Thread(() -> {
            System.out.println("t3 run");
            phaser.register();
            for (int i = 0; i < 10000; i++) {
                phaser.arriveAndAwaitAdvance();
                count++;
                System.out.println("t3:" + i);
            }
            System.out.println("t3 run end");
            phaser.arriveAndDeregister();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public static void func12() {
        List<RecursiveTask<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            RecursiveTask<Integer> recursiveTask = new RecursiveTask<Integer>() {
                @Override
                protected Integer compute() {
                    if (finalI % 2 == 0) {
                        throw new NullPointerException("sssssss");
                    }
                    System.out.println(finalI + " run");
                    int total = 0;
                    for (int i = 0; i < 10000; i++) {
                        total++;
                    }
                    return total;
                }
            };
            tasks.add(recursiveTask);
            recursiveTask.fork();
        }
        for (RecursiveTask<Integer> task : tasks) {
            try {
                System.out.println("join:" + task.join());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("getRawResult:" + task.getRawResult());
        }
    }

    public static void func13() {
        List<RecursiveAction> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            RecursiveAction recursiveTask = new RecursiveAction() {
                @Override
                protected void compute() {
                    System.out.println(finalI + " run");
                }
            };
            recursiveTask.fork();
        }
    }

    public static void func14() {
        List<CountedCompleter<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            CountedCompleter<Integer> countedCompleter = new CountedCompleter<Integer>() {
                int total = 0;

                @Override
                public void compute() {
                    System.out.println(finalI + " run");
                    for (int i = 0; i < 10000; i++) {
                        total++;
                    }
                    //tryComplete();
                }

                @Override
                public void onCompletion(CountedCompleter<?> caller) {
                    System.out.println("onCompletion run!" + finalI + "，total：" + total);
                }

                @Override
                public Integer getRawResult() {
                    return total;
                }
            };
            tasks.add(countedCompleter);
            countedCompleter.fork();
        }
        for (CountedCompleter<Integer> task : tasks) {
            task.join();
            System.out.println(task.getRawResult());
        }
        System.out.println("func end!");
    }

    public static void func15() {
        Exchanger<Integer> exchanger = new Exchanger<>();
        Thread t1 = new Thread(() -> {
            System.out.println("t1 run");
            int num = 0;
            for (int i = 0; i < 10000; i++) {
                num++;
            }
            try {
                count = exchanger.exchange(num) + num;
                System.out.println("t1 count = " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 run end");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2 run");
            int num = 0;
            for (int i = 0; i < 20000; i++) {
                num++;
            }
            try {
                count = exchanger.exchange(num) + num;
                System.out.println("t2 count = " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 run end");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("t3 run");
            int num = 0;
            for (int i = 0; i < 30000; i++) {
                num++;
            }
            try {
                count = exchanger.exchange(num) + num;
                System.out.println("t3 count = " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3 run end");
        });

        t1.start();
        t2.start();
        //启动后，某个线程将会无法结束
        //t3.start();
    }

    public static void func16() throws ExecutionException, InterruptedException {
        List<FutureTask<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int num = 0;
                    for (int j = 0; j < 100; j++) {
                        num++;
                    }
                    return num;
                }
            });
            tasks.add(task);
            task.run();
        }
        for (FutureTask<Integer> task : tasks) {
            System.out.println(task.get());
        }
    }

    static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void func17() throws ExecutionException, InterruptedException {
        List<FutureTask<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int num = 0;
                    for (int j = 0; j < 100; j++) {
                        num++;
                    }
                    return num;
                }
            });
            tasks.add(task);
            executorService.submit(task);
        }
        for (FutureTask<Integer> task : tasks) {
            System.out.println(task.get());
        }
    }


    public static void main(String[] args) throws Exception {

        //chalkReplacer(new int[]{5, 1, 5}, 5);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(5);
        list.sort(Comparator.reverseOrder());
        System.out.println(Arrays.deepToString(list.toArray()));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        long count = Arrays.stream(chalk).sum();
        long num = k > count ? k % count : k;
        for (int i = 0; i < chalk.length; i++) {
            num -= chalk[i];
            if (num < 0) {
                return i;
            }
        }
        return 0;
    }
}
