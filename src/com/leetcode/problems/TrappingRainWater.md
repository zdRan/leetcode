# 42. Trapping Rain Water
## Description
Given n non-negative integers representing an elevation map where the width of each bar is 1, 

compute how much water it is able to trap after raining.
## Example
```$xslt

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

```
## Translation
给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

## Ideas
当前位置能接多少雨水，取决于当前位置左边的最大高度和右边的最大高度。

用两个数组 leftMax、rightMax，分别记录当前位置的左右侧的最大高度。

比如 leftMax[2] = height[2]位置的左侧最大高度,根据上面的输入，leftMax[2] = 1,rightMax[5] = 3

根据 leftMax、rightMax 可以计算出当前位置鞥接多少雨水。

ans[i] = leftMax[i] 与 rightMax[i] 中的最小值 与 height[i] 的差。

## Note
注意测试数据:
[],0