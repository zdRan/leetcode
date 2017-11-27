# 14. Longest Common Prefix
## Description
Write a function to find the longest common prefix string amongst an array of strings.

## Example
```$xslt
```
## Translation
编写一个函数来查找字符串数组中最长的公共前缀字符串。
## Ideas
设 maxPrefix = strs[0] 即当前最长的公共前缀是第一字符串。 

然后依次判断字符串是否以 maxPrefix开头

如果不是，找到当前字符串与 maxPrefix的最长公共前缀，更新 maxPrefix。


## Note

```$xslt
[] 

["","a"]

["abc","a"]
``` 