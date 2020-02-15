package cn.abelib.solution.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 01:56
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = postorder.length;
        if (len < 1) {
            return null;
        }
        int value = postorder[len - 1];
        TreeNode root = new TreeNode(value);
        if (len == 1) {
            return root;
        }
        Map<Integer, Integer> localtion = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            localtion.put(inorder[i], i);
        }
        for (int i = 1; i < len; i++) {
            TreeNode node = root;


        }
        return root;
    }

    @Test
    public void buildTreeTest() {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(inorder, postorder);
        System.err.println(root);
    }
}
