# 12. Integer to Roman
## Description
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

## Example
```$xslt
```
## Translation
给定一个整数，将其转换为罗马数字。 

输入保证在1到3999的范围内。

## Ideas
暴力解法：用一个二维数组记录罗马数字对照表。

其中第一行是个位的罗马数字， 第二行是十位的罗马数字。

例如: 

r[2][3], 代表 10*3 = 30;

r[3][5],代表 100*5 = 500;

然后依次取出整数的每位数字，拼接字符串。


## Note

```$xslt
对照表：
        String[][]r = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}
        };

``` 