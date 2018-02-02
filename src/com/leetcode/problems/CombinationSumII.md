# 2. Add Tow Numbers
## Description
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

+ All numbers (including target) will be positive integers.
+ The solution set must not contain duplicate combinations.
## Example
```$xslt

For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
A solution set is: 
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]

```
## Translation

给定一组候选号码（C）（没有重复）和一个目标号码（T），找出C中所有候选号码的和与T相等的所有组合。

跟上一题类似，区别在于，这次每个号码只能用一次。

## Ideas
DSF，先排序，递归的时候带上当前位置的下标。下一层递归时从当前位置的后一位开始，

添加一个判断，如果当前位置与之前的位置号码重复，就跳过，这样可以保证结果不重复。
## Note
注意测试数据：
```$xslt
[1,1,1,1],2
```