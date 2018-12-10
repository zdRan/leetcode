# 65. Valid Number
## Description
Validate if a given string can be interpreted as a decimal number.

## Example
```$xslt
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false
```
## Translation
验证给定的字符串是否为数字。
## Ideas
这个题不是考算法的，是考验思维的全面性的。

我以为用正则会快一点，没想到直接遍历字符串更快
## Note
