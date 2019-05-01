package cn.abelib.solution.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author abel-huang
 * @date 2016/8/9
 * Use a hashtable to save every root_leaf's value
 */
public class SumRootToLeafNumbers129 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
        System.out.print(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        Map<TreeNode, Integer> hashMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return 0;
        } else {
            int sum = 0;
            stack.push(root);
            hashMap.put(root, root.val);
            while (!stack.empty()) {
                root = stack.pop();
                if (root.right != null) {
                    stack.push(root.right);
                    hashMap.put(root.right, hashMap.get(root) * 10 + root.right.val);
                }
                if (root.left != null) {
                    stack.push(root.left);
                    hashMap.put(root.left, hashMap.get(root) * 10 + root.left.val);
                }
                if (root.left == null && root.right == null) {
                    sum += hashMap.get(root);
                }
            }
            return sum;
        }
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
