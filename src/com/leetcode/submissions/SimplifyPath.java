package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/12/14
 *
 * @author cm.zdran@gmail.com
 */
public class SimplifyPath {
    public static String simplifyPath(String path) {
        List<String> result = new ArrayList<>();

        String[] arr = path.split("/|//");
        for (String str : arr) {
            if (str == null || str.length() == 0) {
                continue;
            }
            if (str.equals(".")) {
                continue;
            }
            if (str.equals("..")) {
                if (result.size() == 0) {
                    continue;
                }
                result.remove(result.size() - 1);
            } else {
                result.add("/" + str);
            }

        }
        System.out.println(Arrays.toString(result.toArray()));
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
    public static String simplifyPath2(String path) {
        StringBuilder sb = new StringBuilder();

        String[] arr = path.split("/|//");
        for (String str : arr) {
            if (str == null || str.length() == 0) {
                continue;
            }
            if (str.equals(".")) {
                continue;
            }
            if (str.equals("..")) {
                if (sb.length() == 0) {
                    continue;
                }else {
                    sb.delete(sb.lastIndexOf("/"), sb.length());
                }
            } else {
                sb.append("/").append(str);
            }

        }
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath2("/a//b////c/d//././/.."));
        System.out.println(simplifyPath2("/a/./b/../../c/"));
        System.out.println(simplifyPath2("/../"));
        System.out.println(simplifyPath2("/home/../../.."));
    }
}
