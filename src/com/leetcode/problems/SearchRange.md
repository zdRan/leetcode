# 34. Search for a Range
## Description
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

## Example
```$xslt
For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

```
## Translation
给定按升序排序的整数数组，找到给定目标值的开始和结束位置。 您的算法的运行时复杂性必须按照O（log n）的顺序。

## Ideas
跟 33题 类似，直接遍历依然可以AC。

解法有很多种，我用的是双指针的办法，从数组两边开始遍历，逐渐缩小范围。

还有一种方法，使用两次二分查找，第一次找比target小的位置，第二次找比target大的位置。

## Note
