package cn.abelib.solution.three;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-02 21:18
 */
public class HouseRobberIII337 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int max = 0;

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        preOrderTraverse(root);
        return this.max;
    }

    public TreeNode preOrderTraverse(TreeNode head) {
        if (head == null) {
            return null;
        }
        if (head.left == null && head.right == null) {
            max = Math.max(max, head.val);
            return head;
        }
        if (head.left != null) {
            head.left.val += head.val;
        }
        if (head.right != null) {
            head.right.val += head.val;
        }
        preOrderTraverse(head.left);
        preOrderTraverse(head.right);

        return head;
    }

    @Test
    public void robTest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(1);

        System.err.println(rob(root));
    }
}