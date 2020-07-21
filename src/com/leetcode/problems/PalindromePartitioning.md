# 前言

跌跌撞撞，跟上一题的提交时间相隔了 8 个月。笑哭.jpg。

整体思路就是首先用 DP 求出所有是否为回文。然后使用 DFS + 回溯 求所有结果集。

# 1. 状态转换方程

DP求解的目标是：**在 O(1) 的时间复杂度的情况下，判断任意子串是否为回文串**

我们用一个 `boolean[][] dp` 数组来记录结果。`dp[i][j] = true` 表示，s 的子串 [i,j] 是回文串。

由此可以得状态转换方程： `dp[i][j] = dp[i+1][j-1] && s.charAt(i) == s.charAt(j)`

含义是：**如果 s 的子串 [i + 1，j - 1] 是回文，且 s 的第 i 个字符与第 j 个字符一样，那么 s 的子串 [i,j] 也是回文**

ok,解决了状态转换方程，再说下构造 DP 的过程。

# 2. DP 求解过程

首先，我们根据需求，是需要求解从 i 到 j 是否为回文串，而且根据 dp[i][j] 的定义，**我们也就只会用到这个 dp 数组的一半的元素。** i 必须是大于等于 j，即用到 dp 数组的 右上角 的部分。

然后，我们先将不需要用到的那部分值全部初始一下。代码如下：

```
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                dp[j][i] = true;
            }
        }
```

由于单个字符是回文，所以 dp[i][i] 是可以初始化成 true 的。

然后再说下 DP 的过程，由于 dp[i][j] 的值取决于 dp[i+1][j-1] 所以需要按照对角线遍历。遍历顺序入下图所示：

![image.png](https://pic.leetcode-cn.com/bfda33e8349616a2326e17a83d4df3b43ad251a26d59115c271c3bcc1c97ffd5-image.png)

写写画画，这个规律也不难找，代码如下：

```
        //构造DP
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j + i < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j + i) && dp[j + 1][j + i - 1]) {
                    dp[j][j + i] = true;
                }
            }
        }
```
好了，DP 数组已经完成了，整个题目就解决了一半了。下面开始另一半

# 3. DFS +回溯

先考虑一个简单的问题，把一个字符串分割成任意的子串，求解所有的分割情况。

标准的深度优先搜索。每一层分割一个子串，分割到最后一层保存结果。然后回溯到上一层。继续分割子串。代码如下：

```
    private static void dfs(String str, int start, List<String> item, boolean[][] dp, List<List<String>> ans) {
        if (start == str.length()) {
            System.out.println(Arrays.deepToString(item.toArray()));
            ans.add(new ArrayList<>(item));
            return;
        }
        for (int i = start + 1; i <= str.length(); i++) {
            item.add(str.substring(start, i));
            dfs(str, i, item, dp, ans);
            item.remove(item.size() - 1);
        }
    }
```

现在我们求解出来了所有的分割情况，而且还能知道每个子串是不是回文。所以，我们修改下 dfs 这个方法，只有当前子串是回文的情况下，我们才会往下递归，其他情况就不需要往下递归了。

代码如下：

```
    private static void dfs(String str, int start, List<String> item, boolean[][] dp, List<List<String>> ans) {

        if (start == str.length()) {
            ans.add(new ArrayList<>(item));
            return;
        }
        for (int i = start + 1; i <= str.length(); i++) {
            if (dp[start][i - 1]) {
                item.add(str.substring(start, i));
                dfs(str, i, item, dp, ans);
                item.remove(item.size() - 1);
            }
        }
    }
```

问题解决。