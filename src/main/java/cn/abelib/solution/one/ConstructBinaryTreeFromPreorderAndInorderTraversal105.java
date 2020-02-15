package cn.abelib.solution.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 01:23
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len < 1) {
            return null;
        }
        int value = preorder[0];
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
            while (true) {
                if (localtion.get(preorder[i]) < localtion.get(node.val)) {
                    if (node.left == null) {
                        node.left =  new TreeNode(preorder[i]);
                        break;
                    } else {
                        node = node.left;
                    }
                }
                if (localtion.get(preorder[i]) > localtion.get(node.val)) {
                    if (node.right == null) {
                        node.right =  new TreeNode(preorder[i]);
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }

        }
        return root;
    }

    @Test
    public void buildTreeTest() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.err.println(root);
    }
}
