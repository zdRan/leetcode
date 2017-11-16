# 6. ZigZag Conversion
## Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example
```$xslt
/*n=numRows
Δ=2n-2    1                           2n-1                         4n-3
Δ=        2                     2n-2  2n                    4n-4   4n-2
Δ=        3               2n-3        2n+1              4n-5       .
Δ=        .           .               .               .            .
Δ=        .       n+2                 .           3n               .
Δ=        n-1 n+1                     3n-3    3n-1                 5n-5
Δ=2n-2    n                           3n-2                         5n-4
*/
作者 @HELLOKENLEE
```
## Translation

给定一个整数数组，返回两个数字的索引，使它们相加到一个特定的目标。

假设每个输入都只有一个解决方案，同一个元素不可以使用两次。

## Ideas
遍历数组，用target减去每个item，判断结果是否存在。

## Note
注意测试数据:

[3,3] ,target = 6