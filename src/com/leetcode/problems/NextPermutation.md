# 31 Next Permutation 
## Description
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.
## Example
```$xslt
Here are some examples. 
Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
```
## Translation
计算下一个排列，将数字重新编排成按字母顺序排列的下一个更大的数字排列。 

如果这样的安排是不可能的，则必须将其重新排列为尽可能最低的顺序（即按升序排序）。
 
替换必须在原地，不要分配额外的内存。

对于数字1、2、3......n的排列情况，不同排列情况是有先后顺序的，题目的目的是根据提供的排列数，计算下一个排列数

对于 1234 来说，排列情况的顺序如下：

1234,1243,1324,1342,1423,1432,2134,2143,2314,2341,2413,2431,3124,3142,3214,3241,3412,3421,4123,4132,4213,4231,4312,4321

就是说，输入为 1432，输出为 2134，输入为 2134，输出为 2143，

排列顺序是按字母大小的顺序，升序排列的。

## Ideas
以 6 3 4 5 4 3 2 1为例，

在 i 位置将数组分为两部分，在 i 的右边找到一个比 i 大一点（i 的下一个值）的数 x。

交换 x 与 i

将 i 之后的数进行升序排列。

包含插入排序。

## Note