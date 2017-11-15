# 4. Median of Two Sorted Arrays
## Description
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

## Example
```$xslt
Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```
## Translation
给定两个有序数组nums1和nums2大小分别为m和n。 

找到这两个数组的中位数。整体运行时间复杂度应为O（log（m + n））。
## Ideas
归并排序，二路归并，归并到一半就出结果了。注意结果是小数。
## Note
注意测试数据:
```$xslt
num1 = [],num2 = [1,2,3]
num1 = [1,2,3],num2 = [1]
num1 = [1],num2 = [1,2,3]
``` 