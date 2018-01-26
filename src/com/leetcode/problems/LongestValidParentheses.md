# 32. Longest Valid Parentheses
## Description
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

## Example
```$xslt
Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

```
## Translation

给定一个只包含字符'（'和'）'的字符串，找出最长有效（格式良好）的括号中的字符串的长度。 

对于“（（）”，最长的有效括号是“（）”，长度= 2。
## Ideas
采用栈，跟之前的[Valid Parentheses](./src/com/leetcode/problems/ValidParentheses.md) 这个类似，不过入栈的是索引值，不是字符。

遇到 '(' 入栈索引值

遇到 ')' 先出栈，

如果栈为空，直接入栈

如果栈不空，用当前索引减去栈顶索引，即得新的有效格式的长度。

## Note
注意测试数据:

```$xslt

``` 