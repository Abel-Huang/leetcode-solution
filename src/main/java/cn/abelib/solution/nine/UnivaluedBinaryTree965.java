package cn.abelib.solution.nine;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 18:13
 */
public class UnivaluedBinaryTree965 {
    /**
     *  Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            if (root.left.val == root.right.val && root.right.val ==root.val) {
                return isUnivalTree(root.left) && isUnivalTree(root.right);
            } else {
                return false;
            }
        }
        if (root.left == null) {
            if (root.right.val ==root.val) {
                return isUnivalTree(root.right);
            } else {
                return false;
            }
        }
        if (root.left.val ==root.val) {
            return isUnivalTree(root.left);
        } else {
            return false;
        }
    }
}
