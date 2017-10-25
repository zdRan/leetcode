# Add Tow Numbers
## Description
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Example
```$xslt
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
```
## Translation

给定两个非空的链表，表示两个非负整数。数字以相反的顺序存储，每个节点包含一个数字。将两个数的和作为链表返回。 

您可以假设两个数字不包含任何前导零，除了数字0本身。
## Ideas
类似于大数相加。遍历链表，逐位相加。注意处理进位。
## Note
注意测试数据:

```$xslt
Input: (3) + (7)
Output: 0 -> 1

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Input: (1) + (9 -> 9)
Output: 0 -> 0 -> 1
``` 