# 60. Permutation Sequence
## Description
The set [1,2,3,...,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
```
"123"
"132"
"213"
"231"
"312"
"321"
```

Given n and k, return the k^th permutation sequence.
## Note

+ Given n will be between 1 and 9 inclusive.
+ Given k will be between 1 and n! inclusive.

## Example
```
Example 1:
Input: n = 3, k = 3
Output: "213"

Example 2:
Input: n = 4, k = 9
Output: "2314"
```

## Translation

给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
```
"123"
"132"
"213"
"231"
"312"
"321"
```

给定 n 和 k，返回第 k 个排列。

说明：

+ 给定 n 的范围是 [1, 9]。
+ 给定 k 的范围是[1,  n!]。

## Ideas
递归。n个数的全排列中 以 1开头的个数是 (n-1)! 个。

比如， [1,2,3,4]  所有的全排列中，以 1开头（1xxx）的元素有 3 的阶乘(6)个。

所以当 k 小于 6 时，最后的结果 一定是 1xxx。

当  7<= k <= 12 时，最后的结果一定是 2xxx。

根据这个归路就可以进行递归，每一层确定一个数值。
## Note
