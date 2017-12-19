# 25. Reverse Nodes in k-Group
## Description
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

## Example
```$xslt
For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

```
## Translation
给定一个链表，k个节点为一组翻转链表，返回链表。

k是一个正整数，小于或等于链表的长度。如果节点的数量不是k的倍数，那末最后的剩余节点应该保持原样。

***Notes***:你的算法应该只使用恒定的空间。您不能修改列表中的值，只能修改节点本身。

## Ideas

使用栈，当栈内的元素足够k个，弹出所有元素形成新的链表。不足k个元素时入栈。
## Note
注意测试数据：
[],1