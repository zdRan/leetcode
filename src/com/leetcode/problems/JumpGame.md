# 45. Jump Game II
## Description
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

**Note:You can assume that you can always reach the last index.**

## Example
```$xslt

Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
    
```
## Translation
给定一个非负整数数组，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

你的目标是使用最少的跳跃次数到达数组的最后一个位置。
```
示例:

输入: [2,3,1,1,4]
输出: 2
解释: 跳到最后一个位置的最小跳跃数是 2。
     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
```
**说明:假设你总是可以到达数组的最后一个位置。**

## Ideas
用[start,end] 表示当前步数下能跳到的区间，比如 arr[0] = 3,那么 在0的时候能跳到[0,3]这个区间内。

然后我们在 [start,end] 这个区间内找一下，下一步最远能跳到哪，比如到 x，

判断一下 x 是不是超过了数组的长度，如果没有超过，那么更新区间 [end,x],步数+1，

接着在该区间找下一步最远跳到哪。

## Note

```$xslt


``` 