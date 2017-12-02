# 16. 3Sum Closest
## Description
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers. 

You may assume that each input would have exactly one solution.
## Example
```$xslt
    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```
## Translation
给定一个n个整数的数组S，在S中找到三个整数，使得总和最接近给定数量的目标。
返回三个整数的和。

你可以假设每个输入都只有一个解决方案。
## Ideas
解法与 [3Sum](./src/com/leetcode/problems/ThreeSum.md) 类似。

3Sum 的判断条件是 和为0，这道题的判断条件是sum与target的值最接近，
即target与sum的绝对值最小。

指针的移动条件也需要修改，

如果当前的sum小于target，说明sum越大越接近target，所以 start++，

同理，如果sum大于target，说明sum越小越接近target，所以end--。

## Note
