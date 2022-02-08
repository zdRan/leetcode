package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 337. 打家劫舍 III
 * Create by Ranzd on 2021-05-08 15:51
 *
 * @author cm.zdran@foxmail.com
 */
public class HouseRobberIII {
    private int count = 0;
    private int max = 0;

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] result =  dfs2(root);
        return Math.max(result[0], result[1]);
    }

    private void dfs(TreeNode root, boolean visible) {
        if (root == null) {
            max = Math.max(max, count);
            return;
        }
        if (!visible) {
            count += root.val;
            dfs(root.left, true);
            dfs(root.right, true);
            count -= root.val;
        }
        dfs(root.left, false);
        dfs(root.right, false);
    }

    /**
     * 返回一个数组，0位置是未选中根节点的最大值，1位置是选中根节点的最大值
     *
     * @param root
     * @return
     */
    private int[] dfs2(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] leftMax = dfs2(root.left);
        int[] rightMax = dfs2(root.right);
        return new int[]{Math.max(leftMax[0], leftMax[1]) + Math.max(rightMax[0], rightMax[1]), root.val + leftMax[0] + rightMax[0]};
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        HouseRobberIII houseRobberIII = new HouseRobberIII();
        int count = houseRobberIII.rob(tree.deserialize("[3,4,5,1,3,null,1]"));
        System.out.println(count);

    }
}
