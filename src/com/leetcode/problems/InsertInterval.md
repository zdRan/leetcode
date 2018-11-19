# 56. Merge Intervals
## Description
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

## Example
```$xslt
Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

```
## Translation
给出一个无重叠的 ，按照区间起始端点排序的区间列表。

在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。

## Ideas
与 [Merge Intervals](./src/com/leetcode/problems/MergeIntervals.md) 类似。

暴力点的解法是将需要插入的值 add 到集合中，然后排序，再合并区间。不过效率比较低，但也能AC。

其实区间是有序的的，所以可以不用排序了。在遍历的时候插入需要插入的区间。类似于插入排序。

## Note
注意测试数据:
```$xslt
[]，[[2.4]]
``` 