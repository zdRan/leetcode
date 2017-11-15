# 1. Two Sum
## Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example
```$xslt
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```
## Translation

给定一个整数数组，返回两个数字的索引，使它们相加到一个特定的目标。

假设每个输入都只有一个解决方案，同一个元素不可以使用两次。

## Ideas
遍历数组，用target减去每个item，判断结果是否存在。

## Note
注意测试数据:

[3,3] ,target = 6