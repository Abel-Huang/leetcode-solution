package cn.abelib.solution.five;


/**
 * @Author: abel.huang
 * @Date: 2020-01-08 23:20
 */
public class DiameterOfBinaryTree543 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 0;
        }

        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);
        max = Math.max(lDepth + rDepth, max);
        return max;
    }
}
