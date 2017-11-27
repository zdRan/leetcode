# 10. Regular Expression Matching
## Description
Implement regular expression matching with support for '.' and '*'.

## Example
```$xslt
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
```
## Translation
实现正则表达式匹配，支持'.'和'*'

'.' 匹配任意一个字符。

'\*' 匹配0个或多个 '\*' 前面的一个字符
## Ideas
使用递归。整体思路是：如果当前字符匹配成功，最终结果是之后的字符是否匹配成功。

定义递归函数`recursion(String s,String p,int sIndex,int pIndex)`

1. 结束条件: sIndex >= s.length() || pIndex >= p.length() 

    需要注意的是: 

    当s匹配结束后，还要判断模式串后面是否有 'a\*b\*'等字符。
    当p匹配结束后，当且仅当s也匹配结束时返回true。

2. 当 `p.charAt(pIndex+1) != '*' `时，

    即 当前匹配的不是 '*'
    
    当 `p.charAt(pIndex) == s.charAt(sIndex)|| p.charAt(pIndex) == '.'`时
    
    返回 recursion(s,p,sIndex+1,pIndex+1)
    
    如果条件不成立，则返回 false。
    
3. 当 `p.charAt(pIndex+1) != '*' `时，
    
    即当前匹配的是 '*'
    
    使用贪心策略，如果当前位置的字符匹配，保持 pIndex不动，不断移动sIndex，每移动一次sIndex，
    
    就判断一次 recursion(s,p,sIndex,pIndex+2)。如果 '*'后面的所有字符都匹配，
    
    可以直接返回true。
    
    如果当前位置的字符不匹配，即 '*' 已经匹配了足够多的字符（也有可能一个字符都没有匹配），
    
    说明 '*' 匹配结束，返回 recursion(s,p,sIndex,pIndex+2)。


4. **_注意递归结束条件，注意边界问题_**

## Note
注意测试数据:
```$xslt
1. "","a*"
2. "ab","c*a*b*d*"
3. "a","c*.a*"
4. "abc" ".*"
```


