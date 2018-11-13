# 50. Pow(x, n)
## Description
Implement pow(x, n), which calculates x raised to the power n (xn).
## Example
```
Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
Example 3:

Input: 2.00000, -2
Output: 0.25000

```
## Note

+ -100.0 < x < 100.0
+ n is a 32-bit signed integer, within the range [−2^31, 2^31 − 1]


## Translation
实现 pow(x, n) ，即计算 x 的 n 次幂函数。
## Note
+ -100.0 < x < 100.0
+ n 是 32 位有符号整数，其数值范围是 [−2^31, 2^31 − 1] 。
## Ideas
递归+分治。对于 pow(x,y)
```
如果 y % 2 == 0
总有 pow(x,y) = pow(x,y/2) * pow(x,y/2)

如果 y % 2 != 0 ，有两种情况:
如果 n > 0
总有 pow(x,y) = pow(x,y/2) * pow(x,y/2) * x

如果 n < 0
总有 pow(x,y) = pow(x,y/2) * pow(x,y/2) * 1 / x
```

## Note
注意测试数据:
```
0.00001
2147483647
```
