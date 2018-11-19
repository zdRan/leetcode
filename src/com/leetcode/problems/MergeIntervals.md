# 56. Merge Intervals
## Description
Given a collection of intervals, merge all overlapping intervals.
## Example
```$xslt
Example 1:
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
```
## Translation
给出一个区间的集合，请合并所有重叠的区间。
## Ideas
先根据每个区间的start值进行排序（升序）。

然后遍历所有区间。

如果当前区间的 start 值大于结果中最后一个区间的end，说明不可以合并。

将该区间加入结果中。

如果当前区间的 start 值小于结果中最后一个区间的end，说明可以合并。

更新结果中最后一个区间的end值。

## Note
注意测试数据:
```$xslt
[]
``` 