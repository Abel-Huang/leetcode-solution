package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author abel-huang
 * @date 2016/8/8
 * A inorderTraversal use stack.
 */
public class BinaryTreeInorderTraversal94 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(3);
        List<Integer> list = inorderTraversal(root);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.empty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            if (!stack.empty()) {
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.right;
            }
        }
        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
