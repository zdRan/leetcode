# 54. Spiral Matrix
## Description
Given a matrix of m x n elements (m rows, n columns), 

return all elements of the matrix in spiral order.
## Example

```$xslt
Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```
## Translation
给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。

## Ideas
主要是找规律， m x n 的矩阵，最多需要转 t 圈才能遍历完，

t = min(m/2+m%2,n/2+n%2)

然后就是依次遍历。
## Note
注意测试数据：

[]
