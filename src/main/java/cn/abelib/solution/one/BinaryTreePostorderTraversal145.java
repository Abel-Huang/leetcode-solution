package cn.abelib.solution.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-02-07 21:40
 */
public class BinaryTreePostorderTraversal145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(postOrderTraversal(root.left));
        list.addAll(postOrderTraversal(root.right));
        list.add(root.val);
        return list;
    }
    @Test
    public void postorderTraversalTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(5);

        postOrderTraversal(root).forEach(System.err::println);
    }
}
