# 51. N-Queens
## Description
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

![八皇后图片](https://assets.leetcode.com/uploads/2018/10/12/8-queens.png)

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

## Example
```$xslt
Example:

Input: 4
Output: [
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
```

## Translation
n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。

给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。

每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。

## Ideas
递归 + 回溯。按行去递归，每一次递归，就尝试在某一行放置一个皇后。直到当前行无法再放皇后，回溯到上一行。继续尝试。

比较耗时的地方是在判断当前位置是否可以放置皇后。

可以直接暴力判断，循环整个棋盘，一定能知道是否冲突，优化点的做法是循环所有行。也能判断出来。

这里说一下，利用空间换时间的做法，可以不通过循环直接判断出是否可以放置皇后。

需要初始化 4个数组

```
xFlag[i] = true: 代表 第 i 行已经放置了皇后。
yFlag[i] = true: 代表 第 i 列已经放置了皇后。
mdFlag[i] = true: 代表 第 i 条主对角线已经放置了皇后。
sdFlag[i] = true: 代表 第 i 条次对角线已经放置了皇后。

主对角线(mdFlag)：

1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 6 8 9

如果 mdFlag[4] = true,那么说明： 在值为 4 的某个位置已经放置了皇后。


次对角线(sdFlag)：

5 4 3 2 1
6 5 4 3 2
7 6 5 4 3
8 7 6 5 4
9 8 7 6 5


如果 mdFlag[6] = true,那么说明： 在值为 6 的某个位置已经放置了皇后。


我们不需要知道已经放置皇后的具体位置，只需要知道，在当前行，当前列，当前
对角线上是否有皇后。


对应关系：

如果在 (i,j) 的位置放置了皇后。那么需要更新 这四个数组

xFlag[i] = true

yFlag[j] = true

mdFlag[i+j] = true

sdFlag[i+n-j-1] =true 


PS:其实我们是按行来递归的，所以可以不用 xFlag 数组的

```

## Note