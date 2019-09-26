package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by ranzhendong on 2019-09-26 11:23
 *
 * @author ranzhendong@maoyan.com
 */
public class ConstructBinaryTree2 {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            index.put(inorder[i], i);
        }
        return dsf(index, inorder, 0, inorder.length , postorder, 0, postorder.length );
    }


    /**
     * 递归与分治，
     * 前序遍历的第一个元素，在中序遍历中的位置为 i，则 i 左边的元素是根节点的左子树，i 右边的元素是根节点的右子树。
     * 并且，的前 i 个元素是 左子树的根节点，之后的元素是右子树的根节点。
     * 优化，空间换时间，可以for 循环用 HashMap替代。
     *
     * @param postorder
     * @param pl
     * @param pr
     * @param inorder
     * @param il
     * @param ir
     * @return
     */
    private static TreeNode dsf(Map<Integer, Integer> index, int[] inorder, int il, int ir, int[] postorder, int pl, int pr) {
        if (pl < 0 || il >= inorder.length || pl >= pr || il > ir) {

            return null;
        }
        TreeNode root = new TreeNode(postorder[pr-1]);
        int i = index.get(postorder[pr-1]);
        //注意边界问题，每次传递到下一层的区间是 左闭右开 [i+1,ir),即下层处理时不包含右边界
        root.right = dsf(index, inorder, i + 1, ir, postorder, pr - (ir - i), pr - 1);
        root.left = dsf(index, inorder, il, i, postorder, pl, pr -(ir - i));
        return root;
    }

    public static void main(String[] args) {
//        buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        buildTree(new int[]{3,2,1},new int[]{3,2,1});
//        buildTree(new int[]{1,2},new int[]{1,2});
    }
}
