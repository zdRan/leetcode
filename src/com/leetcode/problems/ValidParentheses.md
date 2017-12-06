# 20. Valid Parentheses
## Description
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
## Example
```$xslt

```
## Translation
给定一个只包含字符'（'，'）'，'{'，'}'，'['和']'的字符串，确定输入字符串是否有效。 括号必须以正确的顺序关闭，“（）”和“（）[] {}”全部有效，但“（]”和“（[）]”不是。

## Ideas
括号匹配。使用栈，判断栈顶元素与当前元素是否匹配，匹配成功则弹出，不成功则压入栈
## Note
