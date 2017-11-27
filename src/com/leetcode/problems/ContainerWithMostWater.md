# 11. Container With Most Water
## Description
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the 
most water.
## Example
```$xslt

```
## Translation
给定n个非负整数a1，a2，...，an，其中每个代表坐标（i，ai）处的一个点。绘制n条垂直线，使得线i的两个端点处于（i，ai）和（i，0）处
找到两条线，它们与x轴一起形成一个容器，使得容器包含最多的水。

## Note 
你可以不倾斜容器，n至少是2。（注意容器是个长方形，而不是梯形）
## Ideas
因为容器是长方形，所以面积受到的限制条件有2个，一个是宽度，一个是较短的边的高度。

所以可以从数组的两边开始遍历，当左边或者右边的高度较小是指针移动到下一位置。直到两边的指针重合。

每次移动指针时记录 当前的最大面积。

## Note
注意测试数据:

```$xslt
[1,2]
[2,1]
``` 