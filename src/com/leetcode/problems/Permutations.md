# 46. Permutations
## Description
Given a collection of distinct integers, return all possible permutations.
## Example
```
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```

## Translation
给定一个**没有重复数字**的序列，返回其所有可能的全排列。

## Ideas
经典的递归问题，或者说是DSF(深度优先搜索)

全排列：从N个数据中有序的选出N个数，有多少种选择。

我们用程序模拟选择的这个过程，依次的去选。

首先准备一个挡板数组。 flags[nums.length]

选择一个数之后就把当前位置的 flags 置为 True，

下次选择数的时候如果遇到 True 就说明已经选择过了，就跳过。

每一层递归选择一个数。递归结束后记得把 flags 改为 False

## Note
