# 2. Add Tow Numbers
## Description
The count-and-say sequence is the sequence of integers with the first five terms as following:

```$xslt
1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
```
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

## Example
```$xslt

```
## Translation
看了半天才明白题目的含义。
```$xslt
n = 1：1 ：读作 1个1，记作 11
n = 2：11：读作 2个1，记作 21
n = 3：21：读作 1个2，1个1，记作 1211
n = 4：1211：读作 1个1,1个2,2个1,记作 111221
n = 5：111221：读作 ，，，，，，，，，
```
问题是求第 N 个记作什么？
## Ideas
递归，或者循环N次。

可以用遍历的方式切割字符串，也可以用正则表达式。

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