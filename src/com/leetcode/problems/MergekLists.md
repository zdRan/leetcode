# 23. Merge k Sorted Lists
## Description
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

## Example
```$xslt
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
```
## Translation
合并k个已排序的链接列表并将其作为一个排序列表返回。分析并描述其复杂性。
## Ideas
分治 + 归并排序

将数组进行分治，将分治的结果进行归并排序。 
## Note
