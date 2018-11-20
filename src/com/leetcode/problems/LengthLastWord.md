# 58. Length of Last Word
## Description
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

## Example
```$xslt
Example:

Input: "Hello World"
Output: 5    
```
## Translation
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

## Ideas

使用 ' '(空格) 截取，然后取最后一个元素的长度。

## Note

注意测试数据：

```$xslt

"a "
``` 
