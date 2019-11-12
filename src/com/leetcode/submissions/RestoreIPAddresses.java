package com.leetcode.submissions;

import java.util.LinkedList;
import java.util.List;

/**
 * 93. 复原IP地址
 * Create by ranzd on 2019/5/5
 *
 * @author cm.zdran@foxmail.com
 */
public class RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new LinkedList<>();
        dfs(s, ans, new StringBuilder(), 0, 0);
        return ans;
    }

    private static void dfs(String s, List<String> ans, StringBuilder ansItem, int pos, int ipIndex) {
        //剪枝，s 剩余的长度要在 剩余的ip地址范围内
        if (s.length() - pos < 4 - ipIndex) {
            return;
        }
        if (s.length() - pos > (4 - ipIndex) * 3) {
            return;
        }

        if (ipIndex == 4) {
            if (pos >= s.length()) {
                ans.add(ansItem.toString().substring(0, ansItem.length() - 1));
            }
            return;
        }
        if (pos < s.length()) {
            ansItem.append(s.charAt(pos)).append(".");
            dfs(s, ans, ansItem, pos + 1, ipIndex + 1);
            ansItem.delete(ansItem.length() - 2, ansItem.length());
        }
        if (pos + 1 < s.length() && Integer.valueOf(s.substring(pos, pos + 2)) > 9) {

            ansItem.append(s.substring(pos, pos + 2)).append(".");
            dfs(s, ans, ansItem, pos + 2, ipIndex + 1);
            ansItem.delete(ansItem.length() - 3, ansItem.length());
        }
        if (pos + 2 < s.length() && Integer.valueOf(s.substring(pos, pos + 3)) < 256
                && Integer.valueOf(s.substring(pos, pos + 3)) >99) {
            ansItem.append(s.substring(pos, pos + 3)).append(".");
            dfs(s, ans, ansItem, pos + 3, ipIndex + 1);
            ansItem.delete(ansItem.length() - 4, ansItem.length());
        }
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("010010"));
    }
}
