# 5. Longest Palindromic Substring
## Description
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
## Example
```$xslt
Example:
Input: "babad"
Output: "bab"

Note: "aba" is also a valid answer.

Example:
Input: "cbbd"
Output: "bb"
```
## Translation
给定一个字符串s，找到s中最长的回文子字符串。你可以假定s的最大长度是1000。
## Ideas
### Manachar算法:
Manachar算法 只能求解奇数字符串的回文子串的问题。
当字符串为奇数时，Manachar算法会求解出以每个字符为对称轴的回文半径的长度。
求解过程类似于中心扩展算法，以对称轴为中心，向两边扩展，直到两边的字符不一致，或遇到边界。

Manachar算法的巧妙之处在于利用了回文串的对称性。
### 1. 解决字符串奇偶长度不一致的问题。
在每个字符中间插入一个特殊字符。例如： abba -> #a#b#b#a# 。这样能保证，所有的输入都是奇数。

### 2. 回文半径
定义一个数组 RL 让 RL[i] 表示字符串在 i 位置的回文半径(我们把一个回文串中最左或最右位置的字符与其对称轴的距离称为回文半径);
通过求解 RL数组，找到最长的子串。问题转变为求解 RL数组。
回文半径对照：
```$xslt
char:    # a # b # b # a #
 RL :    0 1 0 1 4 1 0 1 0
```
### 3.利用回文串的对称性求解RL
假设：已求解出 RL[0 .. pos],且 RL[pos] = rad，欲求解 RL[pos + k] (k < pos * 2)的值
(p.s:根据假设可以知道，字符串 [0 .. pos * 2],是以pos对称的回文串)

***这里虽然已知 [0 .. pos * 2] 是回文串，但是并不知道 RL[pos + k]的值是多少***
```$xslt
|-----------#-------*--------#----------|
          pos-k    pos      pos+k      pos*2  
```
由于回文串的对称性，所以 RL[pos + k] 与 RL[pos - k] 有三种情况：
#### 3.1 RL[pos - k] < RL[pos] - (pos - k)
如下图：即 pos - k 处的回文长度没有超出 pos 处的回文长度。根据回文串的对称性
那么，RL[pos + k] = RL[pos - k]。
```$xslt
        ****|****        ****|****
|-----------#-------*--------#----------|
          pos-k    pos      pos+k      pos*2 
```

#### 3.2 RL[pos - k] > RL[pos] - (pos - k)
如下图：即 pos - k 处的回文长度超过了 pos 处的回文长度。

***因为 RL[pos] 的值是已知的，如果 RL[pos+k] 的值超出了 pos * 2的话，
那么 RL[pos] 值必然比现在要大***，所以
RL[pos + k] = RL[pos] - (pos - k)

```$xslt
                      **********|**********
***********|**********          |
 |---------#---------*----------#----------|
         pos-k      pos       pos+k      pos*2 
```

通过以上分析可以知道,如果 RL[pos - k] != RL[pos] - (pos - k)
```$xslt
RL[pos + k] = min(RL[pos - k],RL[pos] - (pos - k))
```
#### 3.3  RL[pos - k] == RL[pos] - (pos - k)
如下图，根据回文串的对称性，可知，RL[pos + k] >= RL[pos - k],
即 RL[pos + k] 的最小值为RL[pos - k]。
```$xslt
                    
********|********       ********|********
|-------#-----------*-----------#--------|
          pos-k    pos      pos+k      pos*2 
```
我们将pos 移动到 pos + k 出，回到 3.1 循环判断。

### 4. 利用 RL求解最长回文子串
遍历RL 求解出最大回文串的对称轴所在的位置 center，以及最大的回文半径 max。

```$xslt
s.substring(center - max ,center + max + 1).replace("#","");
//不要忘记去掉添加的特殊字符。
```
## Note 
注意测试数据:

```$xslt
"aaab"
"ababac"
"abbb"
``` 