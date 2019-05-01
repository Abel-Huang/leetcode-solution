package cn.abelib.solution.one;

/**
 *
 * @author abel-huang
 * @date 2016/8/10
 * The same with maxDeepth of tree.
 */
public class BalancedBinaryTree110 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        //root.left=new TreeNode(1);
        //root.left.left=null;
        //root.left.right=new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(3);
        System.out.print(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int maxDepth(TreeNode root) {
        int deep = 0;
        if (root != null) {
            deep = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        return deep;
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
