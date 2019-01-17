# 73. Set Matrix Zeroes
## Description
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
## Example
```$xslt
Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]


Example 2:

Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
```
## Translation
给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

## Ideas

1. 可以使用一个新的矩阵记录当前值是不是进行过置零操作。
2. 也可以仅记录行和列是否进行过置零操作。

空间复杂度为： O(2) 的解法：

对第 2 种解法进行优化，使用矩阵的首行、首列来记录矩阵的行和列是否需要置零。

用2个变量记录首行和首列是否需要置零。
## Note
