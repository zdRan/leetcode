# 27. Remove Element
## Description
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
## Example
```$xslt
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

```
## Translation
给定一个数组和一个值，就地删除该值的所有实例并返回新的长度。

不要为其他数组分配额外的空间，您必须通过在O（1）额外的内存中就地修改输入数组来实现这一点。

元素的顺序可以改变。不关心新长度以外的数据。
## Note
需要在原有的基础上修改数组，使前N个元素不包含指定的值，并且返回N。

## Ideas
大体思路就是，依次将后面的元素往前移动，如果有与val相等的值，就覆盖，没有就移动后面的元素。

定义两个指针，一个指针 index 用于从 nums[1] 开始遍历数组，另一个指针 curr 左边的所有元素不包含指定的值。

如果 nums[curr]  == val，nums[curr] = nums[index];index++;

如果不等于， nums[curr+1] = nums[index],curr++;index++;
## Note
注意测试数据

[3,3,3],3