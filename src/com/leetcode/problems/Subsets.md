# 78. Subsets
## Description
Given a set of distinct integers, nums, return all possible subsets (the power set).

***Notes***: The solution set must not contain duplicate subsets.
## Example
```$xslt
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```
## Translation
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

***Notes***:解集不能包含重复的子集。

## Ideas
递归 + 回溯。参考上一题的求组合数，我们可以求数组 nums 中 包含 0、1、2、3....、N 个元素的组合数，

即是所有的结果。

还有一种比较巧妙的解法：从后向前遍历数组，每遇到一个元素后，

就将该元素与 结果集中的所有 item 构成的集合加入到结果集中。

比如，首先将 空集加入到结果集 [[]],

然后遍历遇到 3，把 空集与 3 组成的集合加入的结果集 [[],[3]]

然后遍历遇到 2，把空集与 2 组成的集合加入的结果集 [[],[3],[2]]
             
把集合 [3] 与 2 组成的集合加入到结果集 [[],[3],[2],[3,2]]

然后遍历遇到 1,把集合 [],[3],[2],[3,2] 与 1 组成的集合分别加入到结果集。
