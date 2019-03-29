# 76. Minimum Window Substring
## Description
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).


Note:

If there is no such window in S that covers all characters in T, return the empty string "".

If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
## Example
```$xslt

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"

```
## Translation
给定一个字符串 S 和一个字符串 T，请在 S 中找出包含 T 所有字母的最小子串。

如果 S 中不存这样的子串，则返回空字符串 ""。
如果 S 中存在这样的子串，我们保证它是唯一的答案。

## Ideas
经典的滑动窗口法。首先统计 t 里字符出现的次数。然后使用双指针，遍历 s, 先扩展窗口，右侧指针右移，直到包含所有 t中的字符。

然后缩放窗口，左侧指针右移。直到不能再删除。找到一个答案。

每找到一个答案与之前的答案比较，取长度较小的结果。

**更新完答案后，左侧指针右移一次，然后再次扩展窗口，右侧指针不断右移，直到再次找到一个答案。**

## Note