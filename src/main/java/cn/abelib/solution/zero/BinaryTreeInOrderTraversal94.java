package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author abel-huang
 * @date 2016/8/8
 * A inorderTraversal use stack.
 */
public class BinaryTreeInOrderTraversal94 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
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

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalReverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(inorderTraversalReverse(root.left));
        list.add(root.val);
        list.addAll(inorderTraversalReverse(root.right));
        return list;
    }
    @Test
    public void inorderTraversalTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(5);

        inorderTraversal(root).forEach(System.err::println);
        inorderTraversalReverse(root).forEach(System.err::println);

    }

}
