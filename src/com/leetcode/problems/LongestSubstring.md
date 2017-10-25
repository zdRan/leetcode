# Longest Substring Without Repeating Characters
## Description
Given a string, find the length of the longest substring without repeating characters.
## Example
```$xslt
Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
## Translation
给定一个字符串，找到没有重复字符的最长子串的长度。
## Ideas
1. 需要两个指针，start 作为子串的起始位置，end作为子串的结束位置。将string从end处分开，start -> (end-1) 部分是当前最长子串

2. 判断当前最长子串内是否存在 end处的字符

3. 如果存在，start移动到 存在的字符处

4. end移动到下一位，回到 2

5. 长度 = end - start + 1 
## Note
注意测试数据:

```$xslt
abbbb
aabca
aaaab
abcdbe
``` 