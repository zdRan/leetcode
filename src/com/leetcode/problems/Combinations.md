# 77. Combinations
## Description
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

## Example
```$xslt
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```
## Translation
给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
## Ideas
递归搜索。每一层获取一个值，当获取到的值与k相等，则获得一个结果。

可以进行一下剪枝优化。如果剩余的n已经不够k个数，可以不再递归。

## Note
