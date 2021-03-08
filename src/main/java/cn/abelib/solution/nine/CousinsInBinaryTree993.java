package cn.abelib.solution.nine;


import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2021-03-07 17:59
 */
public class CousinsInBinaryTree993 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> temp = new LinkedList<>();
        queue.add(root);

        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.val == x) {
                    flag1 = true;
                }
                if (node.val == y) {
                    flag2 = true;
                }
                if (flag1 && flag2) {
                    return true;
                }

                if (node.left != null) {
                    temp.add(node.left);

                }
                if (node.right != null) {
                    temp.add(node.right);
                }
                if (node.left != null && node.right != null) {
                    if ((node.left.val == x && node.right.val == y) || (node.right.val == x && node.left.val == y)) {
                        return false;
                    }
                }
            }

            if (temp.isEmpty()) {
                break;
            }
            queue.addAll(temp);
            temp.clear();

        }
        return false;
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.err.println(isCousins(root, 4, 3));
    }
}
