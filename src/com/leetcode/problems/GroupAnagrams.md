# 49. Group Anagrams
## Description
Given an array of strings, group anagrams together.
## Example
```$xslt
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
```
## Note
+ All inputs will be in lowercase.
+ The order of your output does not matter.

## Translation
给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

示例:
```
输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]  
```

说明：
+ 所有输入均为小写字母。
+ 不考虑答案输出的顺序。

## Ideas
遍历字符串数组，然后将字符串转成char数组，对char数组排序，然后再转成字符串。

## Note
