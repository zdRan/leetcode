package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.leetcode.utils.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-09-30 11:49
 *
 * @author cm.zdran@foxmail.com
 */
public class PathSumII {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> item = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        dsf(root, sum, item, result);
        return result;
    }

    /**
     * 递归 + 回溯。
     * @param root
     * @param sum
     * @param item
     * @param result
     */
    private static void dsf(TreeNode root, int sum, List<Integer> item, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        //发现叶子节点，判断是否满足 sum 条件，满足记录当前结果
        if (root.left == null && root.right == null) {
            if (sum == root.val){
                List<Integer> ans = new ArrayList<>(item);
                ans.add(root.val);
                result.add(ans);
            }
            return;
        }
        item.add(root.val);
        dsf(root.left, sum - root.val, item, result);
        dsf(root.right, sum - root.val, item, result);
        item.remove(item.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.stringToTreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]");
        pathSum(root, 22);
    }
}
