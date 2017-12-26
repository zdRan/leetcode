# 29. Divide Two Integers
## Description
Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.
## Example
```$xslt

```
## Translation
不用乘法，除法和模运算符来计算两个数相除。 

如果溢出，则返回MAX_INT。

## Ideas
使用位运算，先考虑两个数的乘法：

根据竖式计算二进制的乘法过程，可以发现，

如果乘数（b）当前位为1，则取被乘数（a）左移一位的结果加到最终结果（c）中；

如果当前位为0，则取0加到乘积中（加0也就是什么也不做）；


除法其实是乘法的逆过程，从积（c）中依次减去 被乘数（a）左移 N位，

如果减的动，N = N -1，**将 N 加到乘数（b）中** 继续减。

如果减不动，b就是商。

**注意加的是N，即移动的位数，这样做的目的是将乘数（b）的当前位的二进制置为1。**

**注意处理溢出情况**
## Note
注意测试数据：

-2147483648, 1