package cn.abelib.solution.one;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/8.
 * Use hashtable to save deep.
 */
public class LeetCode_111 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = null;
        root.left.right = null;
        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(3);
        System.out.print(minDepth(root) + " ");
    }

    public static int minDepth(TreeNode root) {
        int deep = -1;
        HashMap<TreeNode, Integer> hashMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return 0;
        } else {
            stack.push(root);
            hashMap.put(root, 1);
            while (!stack.empty()) {
                root = stack.pop();
                if (root.right != null) {
                    stack.push(root.right);
                    hashMap.put(root.right, hashMap.get(root) + 1);
                }
                if (root.left != null) {
                    stack.push(root.left);
                    hashMap.put(root.left, hashMap.get(root) + 1);
                }
                if (root.left == null && root.right == null) {
                    if (deep != -1)
                        deep = Math.min(deep, hashMap.get(root));
                    else
                        deep = hashMap.get(root);
                }
            }
            return deep;
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
