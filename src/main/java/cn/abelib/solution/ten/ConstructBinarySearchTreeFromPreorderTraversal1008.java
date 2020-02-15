package cn.abelib.solution.ten;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-14 18:07
 */
public class ConstructBinarySearchTreeFromPreorderTraversal1008 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        int len = preorder.length;
        if (len < 1) {
            return null;
        }
        int value = preorder[0];
        TreeNode root = new TreeNode(value);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = root;
            while (true) {
                if (node.val > preorder[i]) {
                    if (node.left == null) {
                        node.left =  new TreeNode(preorder[i]);
                        break;
                    } else {
                        node = node.left;
                    }
                }
                if (node.val < preorder[i]) {
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
    public void bstFromPreorderTest() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = bstFromPreorder(preorder);
        System.err.println(root);
    }
}