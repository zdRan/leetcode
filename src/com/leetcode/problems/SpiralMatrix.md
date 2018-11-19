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

然后就是依次遍历。定义两个步长值，stepX，stepY,如果当前的位置（x,y）,

则下一步要遍历的是(x+stepX,y+stepY)。

依次遍历 左至右、右至下、右至左、下至上，如果坐标回到初始位置，则说明循环结束一圈。

左至右：stepX = 0，stepY = 1

右至下：stepX = 1，stepY = 0

右至左：stepX = 0，stepY = -1

下至上：stepX = -1，stepY = 0

注意处理一下每一圈循环的边界值。
## Note
注意测试数据：

[]
