package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @Author: abel.huang
 * @Date: 2021-03-08 23:16
 */
public class MaximumLevelSumOfABinaryTree1161 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> level = new LinkedList<>();
        queue.add(root);
        int max = root.val;
        int idx = 1;
        int floor = 1;
        while (true) {
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    level.add(node.left);

                }
                if (node.right != null) {
                    level.add(node.right);
                }
            }
            if (level.isEmpty()) {
                break;
            }

            floor ++;
            int sum = level.stream().mapToInt(x -> x.val).sum();
            if (sum > max) {
                max = sum;
                idx = floor;
            }

            queue.addAll(level);
            level.clear();

        }

        return idx;
    }

    @Test
    public void connectTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        root.right.left = new TreeNode(-7);
        root.right.right = new TreeNode(9);

        System.err.println(maxLevelSum(root));
    }
}
