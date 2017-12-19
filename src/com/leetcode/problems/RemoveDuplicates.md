# 26. Remove Duplicates from Sorted Array
## Description
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
## Example
```$xslt
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.

```
## Translation
给定一个有序数组，删除重复内容，使每个元素只出现一次，并返回新的长度。

不要为其他数组分配额外的空间，您必须通过在O（1）额外的内存中就地修改输入数组来实现这一点。

## Note
需要在原有的基础上修改数组，使前N个元素不重复，并且返回N。

## Ideas

定义两个指针，一个指针 i 用于从 nums[1] 开始遍历数组，另一个指针 curr 左边的所有元素是不重复的元素。

如果 nums[curr]  == nums[i],i++, 

如果不相等， nums[curr+1] = nums[i],curr++。
## Note
