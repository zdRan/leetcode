# 35. Search Insert Position
## Description
Given a sorted array and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
## Example
```$xslt
For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

```
## Translation
给定一个有序数组和目标值，如果找到目标，则返回索引。

如果没有，则返回插入目标值的索引。

数组中没有重复元素。
## Ideas
同样的，遍历一遍也能AC。

可以使用插入排序的算法。

我使用的是二分查找，最后返回的是索引的位置
## Note
注意测试数据：
```$xslt
[1,2,3],5
[1,2,3],0
```