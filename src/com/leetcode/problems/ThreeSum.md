# ThreeSum
## Description
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.


***Notes***: The solution set must not contain duplicate triplets.
## Example
```$xslt
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```
## Translation
给定一个n个整数的数组S，是否存在S中的元素a，b，c，使得a + b + c = 0？
查找数组中所有唯一的三元组，其总和为零。

***Notes***:解决方案集不能包含重复的三元组。

## Ideas
将问题转换为 TwoSum 的问题。由于需要去掉重复的结果，所以需要对 TwoSum 的问题改进。

1. 先将数组排序。

遍历数组，每次从数组中选出一个 A[k] 然后从 A[K] 之后的值中姐姐姐
## Note
这道题考察的可能就是测试数据考虑的全面与否，所以没有给出测试数据。

建议你用本代码做测试，同样的输入，当你的结果跟本代码的结果不一样的话，谨慎提交！！
