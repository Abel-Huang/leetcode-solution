package cn.abelib.solution.two;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 02:32
 */
public class KthSmallestElementInABST230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> ans = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
             kthSmallest(root.left, k);
        }
        ans.add(root.val);
        if (root.right != null) {
            kthSmallest(root.right, k);
        }
        if (k <= ans.size()) {
            return ans.get(k - 1);
        } else {
            return 0;
        }
    }


    @Test
    public void kthSmallestTest() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        System.err.println("ans =" + kthSmallest(root, 3));
    }
}

