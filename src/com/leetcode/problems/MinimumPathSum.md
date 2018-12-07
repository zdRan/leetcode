# 62. Unique Paths
## Description
Given a m x n grid filled with non-negative numbers, 

find a path from top left to bottom right which minimizes the sum of all numbers along its path.

**Note:  You can only move either down or right at any point in time.**
## Example
```$xslt
Example 1:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
```
## Translation

给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

**每次只能向下或者向右移动一步。**

## Ideas
与 [Unique Paths](./src/com/leetcode/problems/UniquePaths.md) 类似。
```
初始化第 0 行 和第 0 列
A[x][0] += A[x-1][0]
A[0][y] += A[0][y-1] 

当 x 和 y 都大于0 时：

A[x][y] += Math.min(A[x-1][y] , A[x][y-1])
```

## Note