package cn.abelib.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by  abel-huang on 2016/7/28.
 * The same with 113th.
 */
public class LeetCode_257 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.left.left=new TreeNode(2);
//        root.left.right=new TreeNode(2);
        root.right = new TreeNode(3);
//        root.right.left=new TreeNode(2);
//        root.right.right=new TreeNode(2);

        System.out.print(binaryTreePaths(root).toString());
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        HashMap<TreeNode, String> hashMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        } else {
            stack.push(root);
            String str = root.val + "";
            hashMap.put(root, str);
            while (!stack.empty()) {
                root = stack.pop();
                String temp = hashMap.get(root);
                if (root.right != null) {
                    stack.push(root.right);
                    hashMap.put(root.right, temp + "->" + root.right.val);
                }
                if (root.left != null) {
                    stack.push(root.left);
                    hashMap.put(root.left, temp + "->" + root.left.val);
                }
                if (root.left == null && root.right == null) {
                    result.add(hashMap.get(root));
                }
            }
            return result;
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
