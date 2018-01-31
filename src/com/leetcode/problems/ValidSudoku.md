# 36. Valid Sudoku
## Description
Determine if a Sudoku is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
## Example
```$xslt

```
## Translation
验证数独是否有效，数独可以部分填充，空单元格填充字符'.'

一个有效的数独（部分填充）不一定是可以解决的。只有填充的单元格需要验证。
## Ideas
没什么好说的，根据数独的规则去for循环验证就可以了。

可以优化的部分是，在循环的时候如何对应每一个小九宫格。

提示：
```$xslt
0,0,0,1,1,1,2,2,2
0,0,0,1,1,1,2,2,2
0,0,0,1,1,1,2,2,2
3,3,3,4,4,4,5,5,5
3,3,3,4,4,4,5,5,5
3,3,3,4,4,4,5,5,5
6,6,6,7,7,7,8,8,8
6,6,6,7,7,7,8,8,8
6,6,6,7,7,7,8,8,8
```
如何根据 i,j 求出对应的值 ??

## Note
注意测试数据:

```$xslt

``` 