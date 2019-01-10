# 72. Edit Distance
## Description
Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:

+ Insert a character
+ Delete a character
+ Replace a character
## Example
```$xslt
Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')


Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
```
## Translation
给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。

你可以对一个单词进行如下三种操作：

+ 插入一个字符
+ 删除一个字符
+ 替换一个字符

```$xslt
示例 1:

输入: word1 = "horse", word2 = "ros"
输出: 3
解释: 
horse -> rorse (将 'h' 替换为 'r')
rorse -> rose (删除 'r')
rose -> ros (删除 'e')


示例 2:

输入: word1 = "intention", word2 = "execution"
输出: 5
解释: 
intention -> inention (删除 't')
inention -> enention (将 'i' 替换为 'e')
enention -> exention (将 'n' 替换为 'x')
exention -> exection (将 'n' 替换为 'c')
exection -> execution (插入 'u')
```
## Ideas
动态规划。状态转换方程如下：

dp[i+1][j+1] 的意义为 word1 从 0 到 i 的字符转换成 word2 从 0 到 j 的字符需要的最少步数。

**注意：dp[0][0] 表示的是空串转换成空串**

转换方程：

    如果 word1[i] == word2[j] 则：

        dp[i + 1][j + 1] = dp[i][j]
    
    否则：
        
        dp[i + 1][j + 1] = Math.min(dp[i][j] + 1, Math.min(dp[i][j + 1] + 1, dp[i + 1][j] + 1));


如果 ```word1[i] == word2[j]``` 那么 word1 从 0 到 i 的字符转换成 word2 从 0 到 j 的字符需要的最少步数就应该
等于word1 从 0 到 i-1 的字符转换成 word2 从 0 到 j-1 的字符需要的最少步数 (最小步数不变)


否则：那么 word1 从 0 到 i 的字符转换成 word2 从 0 到 j 的字符需要的最少步数就应该
等于word1 从 0 到 i-1 的字符转换成 word2 从 0 到 j 的字符需要的最少步数 + 1 (在 word1 里插入一个 word2[j])

或者：word1 从 0 到 i 的字符转换成 word2 从 0 到 j-1 的字符需要的最少步数 + 1 (在 word2 里删除一个 word1[i])

有点绕。。。。

## Note