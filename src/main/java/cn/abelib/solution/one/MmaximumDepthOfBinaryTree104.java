package cn.abelib.solution.one;

/**
 * deep=Math.max(ldeep+1,rdeep+1);
 * @author abel
 */
public class MmaximumDepthOfBinaryTree104 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(3);
        System.out.print(maxDepth(root) + " ");
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
