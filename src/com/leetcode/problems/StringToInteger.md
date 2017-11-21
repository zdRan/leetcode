# 8. String to Integer (atoi)
## Description
Implement atoi to convert a string to an integer.

***Hint***: Carefully consider all possible input cases. 
If you want a challenge, please do not see below and 
ask yourself what are the possible input cases.

***Notes***: It is intended for this problem to be specified 
vaguely (ie, no given input specs). 
You are responsible to gather all the input requirements up front.
## Example
```$xslt

```
## Translation
实现atoi函数，将字符串转换为整数。

***Hint***:仔细考虑所有的测试数据。如果你想要挑战一下，请不要看下面，自己考虑什么是可能的输入案例。

***Notes***:这个问题的定义模糊（即没有给定的输入格式）。你有责任预先收集所有的输入要求。

## Ideas
Java有API，可以实现 string 转 int，但是需要正确的输入。

需要注意的是，尽可能的考虑你的输入数据。只要截取到正确的子串，转换成却变得简单了。

有两种思路，一种是类似于有穷状态机的状态转换。

状态转换：

设置4种状态：
1:初始状态，如果不是[空格、+、-、0-9]之中的字符，直接转 4，读取到 +/- 转到 2，读取到 [0-9] 转到 3
2:读取到 [0-9] 转到 3，读取到其他字符转到 4
3:读取到 [0-9] 转到 3，读取到其他字符转到 4
4:结束状态。

根据状态的不同，做处理。

第二种方法，正则表达式。
可以很简单的匹配到子串，但是需要做很多的判断，判断匹配的子串是否符合题目要求。

## Note
这道题考察的可能就是测试数据考虑的全面与否，所以没有给出测试数据。

建议你用本代码做测试，同样的输入，当你的结果跟本代码的结果不一样的话，谨慎提交！！
