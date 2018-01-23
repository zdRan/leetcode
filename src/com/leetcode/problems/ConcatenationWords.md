# 30. Substring with Concatenation of All Words
## Description
You are given a string, s, and a list of words, words, that are all of the same length. 
Find all starting indices of substring(s) in s that is a concatenation of each word in 
words exactly once and without any intervening characters.
## Example
```$xslt
For example, given:
s: "barfoothefoobarman"
words: ["foo", "bar"]

You should return the indices: [0,9].
(order does not matter).
```
## Translation
给你一个字符串s和一个长度相同的单词列表。从s中找出所有以单词列表串起来的子串的起始位置，这些字符串中的每个单词只是一个字符串，没有任何中介字符。

单词列表的串联顺序是任意的。意思就是找出s中恰好包含所有单词的子串的起始位置

## Ideas
滑块、或者叫窗口搜索。大致意思是定义两个指针，start、end，我们的最终目的是希望，从start至end能恰好包含所有的单词，
即，所有单词可以串联成start至end的字符串。

初始化的时候start和end都是指向0，定义一个count，记录窗口(start,end)内的单词个数。

如果 end + word.length 没有超过 s.length,说明end后面还有可用的单词，然后开始循环

如果s的子串 [end,end+word.length),是一个单词，那么end移动到end+word.length，单词个数加1，

如果count与总的单词个数相等，说明找到一个答案。

如果s的子串 [end,end+word.length),不是一个单词，start后移，end = start，单词个数清零。

关于重复单词的问题：

定义两个map集合，一个用于记录原始的单词与个数的映射，一个用于记录滑块窗口的单词与个数的映射。

每次移动end的时候，判断一下滑块里的当前单词个数是否超出了原始的单词个数，超出就移动start，临时数据清零

## Note