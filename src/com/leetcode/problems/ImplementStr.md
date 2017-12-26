# 28. Implement strStr()
## Description
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
## Example
```$xslt
Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
—————————————————————————————————————————
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
```
## Translation
实现strStr() 方法

返回子串在String中的位置，如果子串不是String的一部分，则返回-1。

## Ideas
与 [3Sum](./src/com/leetcode/problems/ThreeSum.md) 类似，不过3sum是外部确定一个数，这次是利用双重循环确定两个数，

然后在后面的部分解决 [Two sum](./src/com/leetcode/problems/TwoSum.md) 的问题
## Note
注意测试数据：

[0,0,0,0],1

[0,0,0,0,0],0

[-1,0,1,2,-1,-4],0