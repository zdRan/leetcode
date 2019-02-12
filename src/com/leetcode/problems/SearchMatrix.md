# 74. Search a 2D Matrix
## Description
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

+ Integers in each row are sorted from left to right.
+ The first integer of each row is greater than the last integer of the previous row.

## Example
```$xslt
Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
______________________
Example 2:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false

```
## Translation
编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

+ 每行中的整数从左到右按升序排列。
+ 每行的第一个整数大于前一行的最后一个整数。
## Ideas
二分法查找，先对数组的第一列用二分法，找到对应的行。

然后再在找到的某一行使用二分法。

## Note
注意测试数据:

+ {{1}}，1

+ {{}},1