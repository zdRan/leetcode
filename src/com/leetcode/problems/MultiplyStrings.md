# 43 Multiply strings 
## Description
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
## Example
```$xslt
Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
__________________________________
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
```
## Translation
给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

## Note
1. num1 和 num2 的长度小于110。
2. num1 和 num2 只包含数字 0-9。
3. num1 和 num2 均不以零开头，除非是数字 0 本身。
4. 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
## Ideas
还记得我们是如何用竖式做乘法的么？

首先确定结果的最大长度：一个 n位数乘以一个m位数的结果最大为 n+m位。

以 123 * 456 为例：num1 = [1,2,3] * num2 = [4,5,6]
```
index               0   1   2

                    1   2   3
                    4   5   6

ansIndex    0   1   2   3   4
_______________________________      
6 * 3                   1   8
5 * 3               1   5
4 * 3           1   2
                _______________
6 * 2               1   2
5 * 2           1   0
4 * 2           8
                _______________
6 * 1               6
5 * 1           5
4 * 1       4
            ___________________
            5   6   0   8   8    


注意每一位数字的下标，有没有发现一个规律

把 num1[i] * num2[j] 的乘积累加到 ans[i+j] 
把 num1[i] * num2[j] 的进位为累加到 ans[i+j-1]

最后的答案就出来了
      
```
## Note

注意 
```
0 * 0 = 0
```