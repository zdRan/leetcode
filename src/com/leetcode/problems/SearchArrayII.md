# 81. Search in Rotated Sorted Array II
## Description
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

You are given a target value to search. If found in the array return true, otherwise return false.
## Example
```$xslt
Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true


Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```
## Translation
假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。

编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。

## Ideas
暴力的方法是直接遍历一遍就能求解。而且可以AC。

实在是不想考虑二分法，偷了个懒。

如果 target 比 第一个元素 小，就从前开始遍历，反之从后开始遍历。

相当于用了一次二分，不过分割点选择的是数组旋转点。

## Note

注意测试数据: [] ,5