# 7. Reverse Integer
## Description
Given a 32-bit signed integer, reverse digits of an integer.

## Example
```$xslt
Input: 123
Output:  321

Input: -123
Output: -321

Input: 120
Output: 21

```
## Translation
给定一个32位有符号整数，返回整数的反转数字。
## Note
假设我们只能处理32位有符号整数范围内的整数。出于这个问题的目的，假设你的函数在整数溢出时返回0。
## Ideas
字符串翻转，java有API，StringBuilder().reverse()。
字符串转int ,java有API，Integer.parseInt(str)。

判断一下正数负数，正数直接翻转，负数加上符号翻转。

catch下异常，有异常时返回0.
## Note
注意测试数据:

[3,3] ,target = 6