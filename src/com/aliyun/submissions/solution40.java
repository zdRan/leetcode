package com.aliyun.submissions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 40.2的幂次方数
 * Create by Ranzd on 2020-07-16 15:29
 *
 * @author ranzhendong@maoyan.com
 */
public class solution40 {
    public static int solution(int n, int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        int count = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int num = entry.getKey();
            int two = 1;
            boolean contains = false;
            for (int i = 1; i < 31; i++) {
                two <<= 1;
                //剪枝
                if (two > max * 2) {
                    break;
                }
                if (two < num) {
                    continue;
                }
                if (countMap.containsKey(two - num)) {
                    if (two - num == num && entry.getValue() == 1) {
                        continue;
                    } else {
                        contains = true;
                    }
                    break;
                }
            }
            if (!contains) {
                count += entry.getValue();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, new int[]{1, 3}));
    }
}
