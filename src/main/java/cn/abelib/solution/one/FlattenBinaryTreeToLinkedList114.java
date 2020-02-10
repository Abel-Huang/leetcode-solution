package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-02 17:15
 */
public class FlattenBinaryTreeToLinkedList114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        root = preOrderTraverse(root);
        while (root != null) {
            System.err.println(root.val);
            root = root.right;
        }
    }

    public TreeNode preOrderTraverse(TreeNode head) {
        if (head == null) {
            return null;
        }

        if (head.left == null && head.right == null) {
            return head;
        }
        TreeNode right = preOrderTraverse(head.right);
        TreeNode left = preOrderTraverse(head.left);

        if (left != null) {
            head.right = left;
            head.left = null;
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
            left.left = null;
        } else  {
            head.right = right;
            head.left = null;
        }
        return head;
    }

    @Test
    public void flattenTest() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        flatten(root);
    }
}
