# 22. Generate Parentheses
## Description
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

## Example

```$xslt
For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

```
## Translation
给定n对括号，编写一个函数来生成正确括号的所有组合。

## Ideas
类似与打印 1-N 所有的排列数。

已知是 N 对括号，所以左右括号的最大值都是N。

并且，在任意一个正确的排列顺序中，每个位置的左括号的个数都大于等于右括号。

使用递归

如果当前位置剩余的左括号个数大于0，则当前位置可以为左括号，

如果当前位置剩余的左括号个数小于右括号，则当前位置可以是右括号。

如果当前位置没有剩余则添加一个答案。

## Note
