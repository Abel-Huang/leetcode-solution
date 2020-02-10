package cn.abelib.solution.two;

/**
 * @Author: abel.huang
 * @Date: 2020-02-01 01:03
 */
public class LowestCommonAncestorBinaryTree236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        return null;
    }
}
