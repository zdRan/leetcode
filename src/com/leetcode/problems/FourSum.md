# 18. 4Sum
## Description
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 

Find all unique quadruplets in the array which gives the sum of target.

***Notes***: The solution set must not contain duplicate quadruplets.
## Example
```$xslt
For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
```
## Translation
给定一个n个整数的数组S，是否存在S中的元素a，b，c和d，使得a + b + c + d = target？

在数组中找出所有唯一的四元组，给出目标的总和。

***Notes***:解决方案集不能包含重复的四元组。

## Ideas
与 [3Sum](./src/com/leetcode/problems/ThreeSum.md) 类似，不过3sum是外部确定一个数，这次是利用双重循环确定两个数，

然后在后面的部分解决 [Two sum](./src/com/leetcode/problems/TwoSum.md) 的问题
## Note
注意测试数据：

[0,0,0,0],1

[0,0,0,0,0],0

[-1,0,1,2,-1,-4],0