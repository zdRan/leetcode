# 19. Remove Nth Node From End of List
## Description
Given a linked list, remove the nth node from the end of list and return its head.

***Notes***:Given n will always be valid.Try to do this in one pass.
## Example
```$xslt
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```
## Translation
给定一个链表，删除列表的倒数第n个节点并返回它的头部。

***Notes***:n永远是有效的。尝试一次完成。

## Ideas
3种解法：

1. 将链表翻转，删除第N个节点，然后再将链表翻转，返回。
2. 两次遍历，第一次遍历计算出链表的长度，第二次删除第 （L-n）个节点
3. 两个指针。使用两个指针，start与end相差n个节点，同时移动，当end到链表尾部时，删除start节点
## Note
注意测试数据：

[1],1