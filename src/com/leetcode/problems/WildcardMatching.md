# 44. Wildcard Matching
## Description
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

**Note:**

s could be empty and contains only lowercase letters a-z.

p could be empty and contains only lowercase letters a-z, and characters like ? or *.
## Example
```$xslt
Example 1:

Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input:
s = "aa"
p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input:
s = "cb"
p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
Example 4:

Input:
s = "adceb"
p = "*a*b"
Output: true
Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
Example 5:

Input:
s = "acdcb"
p = "a*c?b"
Output: false

```
## Translation
给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。

'?' 可以匹配任何单个字符。
'*' 可以匹配任意字符串（包括空字符串）。
两个字符串完全匹配才算匹配成功。

说明:

s 可能为空，且只包含从 a-z 的小写字母。

p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
## Ideas
与第10题 [Regular Expression Matching](./src/com/leetcode/problems/RegularExpressionMatching.md) 很类似。

一开始的时候也是使用了第10题的思路，递归。如果当前字符匹配成功，最终结果是之后的字符是否匹配成功。

但是超时了。只能改为动态规划了。

定义一个二维的状态数组 ```boolean dpArray[s.length()+1][p.length()+1]```

**其中 dp[i][j] 表示：s的前i个字符与p的前j个字符是否匹配。**

我们定义 ```dpArray[0][0] = true```,表示 ```s = "",p = "" ```是匹配成功的。

定义状态转换方程：假设我们已知 dpArray[0...i-1][0...j-1] 的值，那么可以推导出dpArray[i][j]的值

* 当 ```p[j] = "*"```
```
分3种情况：
1. p[j] = "*"

    1.1 让"*"匹配 0 个 字符。
        那么 dpArray[i][j] = dpArray[i][j-1]
        
        解释一下：如果 s[i] 和 p[j-1] 匹配，那么 s[i] 和 p[j] 也匹配
        
        s =  abcd p = ab*cd i = 1，j = 2
        dpArray[1][2] = dpArray[1][1]
        
    1.2 让"*" 匹配1个字符
        那么 dpArray[i][j] = dpArray[i-1][j-1]
        
        解释一下：如果 s[i-1] 和 p[j-1] 匹配，那么 s[i] 和 p[j] 也匹配
        s =  abcd p = ab*d i = 2，j = 2
        dpArray[2][2] = dpArray[1][1]
    
    1.3 让"*" 匹配N个字符
        那么 dpArray[i][j] = dpArray[i-1][j]
        
        解释一下：如果 s[i-1] 和 p[j] 匹配，那么 s[i] 和 p[j] 也匹配
        s =  abcd p = a*d i = 2，j = 2
        dpArray[2][1] = dpArray[1][1]
 
```
* 当 ```p[j] = "?"```
```
"?"只能匹配一个字符，所以

dpArray[i][j] = dpArray[i-1][j-1]

解释一下：如果 s[i-1] 和 p[j-1] 匹配，那么 s[i] 和 p[j] 也匹配
```
* 当 ```p[j] = "a-z"```
```

dpArray[i][j] = dpArray[i-1][j-1] && s[i] == p[j]

解释一下：如果 s[i-1] 和 p[j-1] 匹配 并且 s[i] == p[j]，那么 s[i] 和 p[j] 也匹配

如果不太理解可以手动实现这个过程：以 s = abcd ，p =  a*d 为例

        ""  a   *   d
    ""  T   F   F   F
 
    a   F   T   T   F
    
    b   F   F   T   F
    
    c   F   F   T   F
    
    d   F   F   T   T

多手写几次这个数组慢慢就理解了。
```

最后 ```dp[s.length()][p.length()]```就是最终答案
## Note
注意测试数据:

```$xslt
s = "" p = ""
s = "abcd" p = "*abcd"
s = "abcd" p = "****abcd"
s = "abcd" p = "****a*b*c*d*"
``` 