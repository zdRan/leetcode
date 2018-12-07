# 62. Unique Paths
## Description
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

**Note: m and n will be at most 100.**

## Translation
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

**说明：m 和 n 的值均不超过 100**

## Example
```
输入:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
输出: 2
解释:
3x3 网格的正中间有一个障碍物。
从左上角到右下角一共有 2 条不同的路径：
1. 向右 -> 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右 -> 向右

```
## Ideas

与 [Unique Paths](./src/com/leetcode/problems/UniquePaths.md) 类似，加了路障后的规律是
```
当 x 和 y 都大于0 时：

if A[x][y] == 1
    A[x][y] = 0
else
    A[x][y] = A[x-1][y] + A[x][y-1]
```
区别是：在初始化第 0 行，和第 0 列时，

只要遇到路障，那么路障之后的位置都不可达。都需要设为 0

**注意处理好 A[0][0]位置**

## Note
注意测试数据：
```
1、[[0]]
2、[[1,0]]
3、[[0,1]]
4、[[1],[0]]
5、[[0],[1]]
```