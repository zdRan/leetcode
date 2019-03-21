# 37. Sudoku Solver
## Description
Write a program to solve a Sudoku puzzle by filling the empty cells.

Empty cells are indicated by the character '.'.

You may assume that there will be only one unique solution.

## Example
```$xslt

```
## Translation

编写一个程序，通过填充空单元格来解决数独谜题。 空单元格由字符'。'表示。 

数独只有一个解
## Ideas
使用3个二维数组，分别记录 每一行、每一列、每个小九宫格里已经出现的数字。

然后使用 DSF。对每个需要填充的单元格进行递归。递归时根据之前统计的3个二维数组来判断应该填哪个数字

## Note
