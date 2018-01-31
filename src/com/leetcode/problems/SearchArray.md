# 33. Search in Rotated Sorted Array
## Description
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
## Example
```$xslt

```
## Translation
假设按照升序排列的数组在事先未知的某个关键点上旋转。

(例如, 0 1 2 4 5 6 7 可能成为 4 5 6 7 0 1 2).

给你一个目标值来搜索。如果在数组中发现它返回其索引，否则返回-1。 

数组中没有重复元素。

## Ideas
暴力的方法是直接遍历一遍就能求解。而且可以AC。

但是该题考察的应该是二分查找

将二分查找改进一下，取得中点后判断一下中点在哪个部分（与数组的第一个值比较一下）。

然后根据结果进行移动二分查找的区间。

## Note
