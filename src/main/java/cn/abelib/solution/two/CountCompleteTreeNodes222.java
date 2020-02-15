package cn.abelib.solution.two;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 03:49
 */
public class CountCompleteTreeNodes222 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
