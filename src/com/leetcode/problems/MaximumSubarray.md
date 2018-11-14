# 53. Maximum Subarray
## Description
Given an integer array nums, find the contiguous subarray (containing at least one number) 

which has the largest sum and return its sum.
## Example
```$xslt
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

```
## Follow up
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, 

which is more subtle.

## Translation
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

```
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: 连续子数组 [4,-1,2,1] 的和最大，为 6。

```
## Ideas
动态规划。遍历整个数组，当遍历第 i 个元素时，

如果当前统计的最大和为负数。则舍弃统计值，从第 i 个元素的值开始统计。

否则，将第 i 个元素的值加入到当前统计值。

判断当前统计值，与最终值的大小，更新最终值。


说明：子序列的最大和，取决于， A[i] 与 A[i] 之前的子序列和。

如果 A[i]之前的子序列和 为负数。那么，A[i] 的值一定大于 (A[i]+ A[i]之前的子序列和)

因为 A[i]之前的子序列和 为负数，x加上一个负数一定小于x。

同样，如果 A[i]之前的子序列和 为正数，那么当前的子序列和最大值一定是 (A[i]+ A[i]之前的子序列和)。

因为 A[i]之前的子序列和 为正数，x加上一个正数一定大于x。

## Note
