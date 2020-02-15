package cn.abelib.solution.eight;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 03:32
 */
public class BinaryTreePruning814 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return null;
            }
        }
        return root;
    }

    @Test
    public void pruneTreeTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode node = pruneTree(root);
        System.out.print(node);
    }
}
