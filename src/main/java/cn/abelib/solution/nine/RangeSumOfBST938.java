package cn.abelib.solution.nine;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 17:10
 */
public class RangeSumOfBST938 {
    /**
     *  Definition for a binary tree node.
      */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        sum += rangeSumBST(root.left, L, R);
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        sum += rangeSumBST(root.right, L, R);
        return sum;
    }

    @Test
    public void rangeSumBSTTest() {
        TreeNode root = new TreeNode(10);

    }

}
