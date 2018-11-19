# 55. Jump Game
## Description
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

## Example
```$xslt
Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: 

Jump 1 step from index 0 to 1, then 3 steps to the last index.


Example 2:

Input: [3,2,1,0,4]
Output: false
Explanation: 

You will always arrive at index 3 no matter what. Its maximum
jump length is 0, which makes it impossible to reach the last index.
    
```
## Translation
给定一个非负整数数组，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

判断你是否能够到达最后一个位置。

## Ideas

依次遍历数组，当前位置能够达到的最远的距离为 ```i + a[i]```,

不断更新能够达到的最大值。

最后判断是否超过数组长度。
