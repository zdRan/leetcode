# 47. Permutations II
## Description
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

## Example
```
Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
```

## Translation

给定一个可能**包含重复数字**的序列，返回所有**不重复**的全排列。

## Ideas
跟 46 题非常类似，唯一的区别就是去重。

去除重复的全排列的原理：

首先，数组必须是有序的，不管是升序还是降序。必须要保证所有的重复数字是相邻的。

比如 [1,1,2],不能是 [1,2,1]

假设当前递归到 x 位置（该选择第 x 个数字）,

如果 nums[x-1] == nums[x] 并且 flags[x-1] = True:

说明：这是第一次出现的重复数字，是允许的。

如果  flags[x-1] = True:

说明：这不是第一次出现了，是不被允许的。要跳过。

PS：你可以手动试一下。

比如 nums = [1,1,2]

第一次出现 [1,1,2] 的时候 flags[0] = True
第二次出现 [1,1,2] 的时候 flags[0] = False


## Note
