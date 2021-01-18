package cn.abelib.solution.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author abel-huang
 * @date 2016/8/8
 * Use hashtable to save deep.
 */
public class MinimumDepthOfBinaryTree111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 非递归
     * @param root
     * @return
     */
    public int minDepth1(TreeNode root) {
        int deep = -1;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return 0;
        }
        stack.push(root);
        map.put(root, 1);
        while (!stack.empty()) {
            root = stack.pop();
            if (root.right != null) {
                stack.push(root.right);
                map.put(root.right, map.get(root) + 1);
            }
            if (root.left != null) {
                stack.push(root.left);
                map.put(root.left, map.get(root) + 1);
            }
            if (root.left == null && root.right == null) {
                if (deep != -1) {
                    deep = Math.min(deep, map.get(root));
                } else {
                    deep = map.get(root);
                }
            }
        }
        return deep;
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = null;
        root.left.right = null;
        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(3);
        System.out.print(minDepth1(root) + " ");
    }
}
