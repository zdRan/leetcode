# 62. Unique Paths
## Description
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

**Note: m and n will be at most 100.**
## Example
```$xslt
Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right


Example 2:

Input: m = 7, n = 3
Output: 28
```
## Translation

一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？

**说明：m 和 n 的值均不超过 100**

## Ideas
```
从 [0,0]到 [x,y]位置的路径数入为 A[x][y]:

1 1 1 1 1
1 2 3 4 5
1 3 6 10 15
1 4 10 20 35

规律是 ： 当 x 和 y 都大于0 时：

A[x][y] = A[x-1][y] + A[x][y-1]

x = y = 0 时：

A[x][y] = 1

```

## Note