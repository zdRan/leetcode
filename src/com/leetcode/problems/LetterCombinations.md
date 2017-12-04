# 17. Letter Combinations of a Phone Number
## Description
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
## Example
```$xslt
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```
## Translation
为数字字符串，返回数字可能表示的所有可能的字母组合。

数字到字母的映射（就像电话按钮一样）在下面给出。
```$xslt
1 : "1"
2 : "abc"
3 : "def"
4 : "ghi"
5 : "jkl"
6 : "mno"
7 : "pqrs"
8 : "tuv"
9 : "wxyz"
0 : "0"

```

## Ideas

类似于打印排列组合数，递归、栈、队列、甚至是树都可以。

每一层递归确定一位，结束条件是当前位置超出输入的字符串。

当结束时把结果添加到结果集
## Note
注意测试数据:

```$xslt
Input: ""
Output: []

注意是 [] 而不是 [""]
``` 