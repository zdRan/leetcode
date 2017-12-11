# 24. Swap Nodes in Pairs
## Description
Given a linked list, swap every two adjacent nodes and return its head.

***Notes***: Your algorithm should use only constant space. 
You may not modify the values in the list, only nodes itself can be changed.
## Example
```$xslt
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
```
## Translation
给定一个链表，交换每两个相邻节点并返回其头部。

***Notes***:你的算法应该只使用恒定的空间。您不能修改列表中的值，只能修改节点本身。

## Ideas
根据题目要求，交换相邻的两个节点，不能使用额外的空间，不能修改节点的值。所以我们只能操作指针，

使用递归：

交换后，节点2 应该指向节点1,节点1，应该指向节点3交换后的head

节点4 应该指向节点3，节点3应该指向节点4交换后的 head

依次递归，指定最后一个节点，返回其本身。

## Note
注意测试数据：

[]