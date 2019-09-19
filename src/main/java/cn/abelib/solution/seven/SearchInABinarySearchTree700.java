package cn.abelib.solution.seven;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 21:21
 */
public class SearchInABinarySearchTree700 {

    /**
     * Definition for a binary tree node.
      */
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val > root.val) {
            return searchBST(root.right, val);
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        return null;
    }
}
