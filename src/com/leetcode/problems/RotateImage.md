# 48. Rotate Image
## Description
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 

DO NOT allocate another 2D matrix and do the rotation.
## Example
```$xslt
Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
______________________________________________________

Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
```
## Translation
给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。
## Ideas
注意找规律，一圈一圈的旋转。
```
# # # # #
# $ $ $ #
# $ % $ #
# $ $ $ #
# # # # #

先旋转 # 的部分，再旋转 $ 的部分。将 # 的部分分为，上，下，左，右四个部分。

依次旋转 上 -> 右 -> 下 -> 左

规律 x1，y1 --> y1,n-x1
```
## Note
