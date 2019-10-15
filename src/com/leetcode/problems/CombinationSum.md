# 2. Add Tow Numbers
## Description
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

+ All numbers (including target) will be positive integers.
+ The solution set must not contain duplicate combinations.
## Example
```$xslt
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
```
## Translation

给定一组候选号码（C）（没有重复）和一个目标号码（T），找出C中所有候选号码的和与T相等的所有组合。

## Ideas
dfs，先排序，递归的时候带上当前位置的下标。下一层递归时从当前位置开始，这样可以保证结果不重复。
## Note
