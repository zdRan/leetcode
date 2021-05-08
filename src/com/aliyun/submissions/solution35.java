package com.aliyun.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 35.找出二叉搜索树的第2大的数
 * Create by Ranzd on 2020-07-11 21:41
 *
 * @author cm.zdran@foxmail.com
 */
public class solution35 {
    public int solution(TreeNode root) {
        return  dfs(null, root);
    }
    public int dfs(TreeNode pNode, TreeNode curNode){
        if(curNode.right!=null){
            return dfs(curNode, curNode.right);
        }
        if(curNode.left!=null){
            return curNode.left.val;
        }
        return pNode.val;
    }
}
