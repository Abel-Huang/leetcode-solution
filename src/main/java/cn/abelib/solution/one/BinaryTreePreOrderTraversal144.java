package cn.abelib.solution.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/8.
 * A preordertraversal use stack.
 */
public class BinaryTreePreOrderTraversal144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }

        stack.push(root);

        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalReverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversalReverse(root.left));
        list.addAll(preorderTraversalReverse(root.right));
        return list;
    }

    @Test
    public void preorderTraversalTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(5);

        //preorderTraversal(root).forEach(System.err::println);
        preorderTraversalReverse(root).forEach(System.err::println);
    }

}
