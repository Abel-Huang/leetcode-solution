package cn.abelib.solution.five;


/**
 * @Author: abel.huang
 * @Date: 2020-01-08 22:50
 */
public class ConvertBST2GreaterTree538 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += num;
        num = root.val;
        convertBST(root.left);
        return root;
    }
}
