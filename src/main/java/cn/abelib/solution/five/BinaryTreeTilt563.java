package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 04:12
 */
public class BinaryTreeTilt563 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    int sum = 0;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sum += singleTilt(root);
        findTilt(root.left);
        findTilt(root.right);
        return sum;
    }

    public int singleTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.abs(nodeSum(root.right) - nodeSum(root.left));
    }

    public int nodeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + nodeSum(root.left) + nodeSum(root.right);
    }

    @Test
    public void findTiltTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);

        System.err.println(findTilt(root));
    }
}
