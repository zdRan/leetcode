# 41. First Missing Positive
## Description
Given an unsorted integer array, find the smallest missing positive integer.

**Note:** Your algorithm should run in O(n) time and uses constant extra space.
## Example
```$xslt
Example 1:

Input: [1,2,0]
Output: 3
___________________
Example 2:

Input: [3,4,-1,1]
Output: 2
___________________
Example 3:

Input: [7,8,9,11,12]
Output: 1
```
## Translation
给定一个未排序的整数数组，找出其中没有出现的最小的正整数。

***Notes***:你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。

## Ideas
数组的下标是有序的，可以利用数组的下标。

实现方法类似于桶排序。

我们排序的最终目标是: nums[i] = i-1

然后遍历整个数组，如果不符合上述目标的位置是 x，没有出现的最小整数即是 x+1。

下面简单说一下怎么对数组进行排序，如果还是不太明白，可以先学习下如何实现对0-9进行桶排序

先把 nums[0]位置的数拿出来 放到temp里，然后看一下temp 应该放到哪个位置（内循环）。

然后把这个位置的数与temp交换一下，然后再看一下temp应该放到哪个位置。

直到所有的temp没有地方放了，temp的值已经超数组下标了。就结束循环。

然后再去拿nums[1]。
## Note
需要注意数组中的值是否超出数组下标。