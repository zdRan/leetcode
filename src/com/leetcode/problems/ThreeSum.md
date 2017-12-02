# 15. ThreeSum
## Description
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.


***Notes***: The solution set must not contain duplicate triplets.
## Example
```$xslt
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```
## Translation
给定一个n个整数的数组S，是否存在S中的元素a，b，c，使得a + b + c = 0？
查找数组中所有唯一的三元组，其总和为零。

***Notes***:解决方案集不能包含重复的三元组。

## Ideas
将问题转换为 [Two sum](./src/com/leetcode/problems/TwoSum.md) 的问题。

由于需要去掉重复的结果，所以需要对 TwoSum 的问题改进。

1. 先将数组排序。

遍历数组，每次从数组中选出一个 A[k] 然后从 A[K] 之后的值中解决 TwoSum的问题。

2. TwoSum
由于要过滤调重复的结果集，所以需要对 TwoSum 的解法改进。

由于数组是有序的，所以可以从数组的两端开始遍历数组，定义两个指针 start、end。

start从下标0开始遍历，end从数组的结尾开始遍历，如果两个数的和等于target，将结果记录。

如果两个数的和小于target那么说明start的值太小，将start移动，同样，和大于target的话

移动end，

每次移动的时候需要跳过相同的值，即如果 A[start+1] ==  A[start] 就跳过start+1，

因为，如果A[start+1]是某个结果的一部分的话，在start的时候就会记录下来了。
## Note
注意测试数据：

[0,0,0,0,0]

[-1,0,1,2,-1,-4]