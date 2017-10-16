package cn.abelib.one;

/**
 * Created by abel-huang on 2016/8/10.
 * The same with maxDeepth of tree.
 */
public class LeetCode_110 {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        //root.left=new TreeNode(1);
        //root.left.left=null;
        //root.left.right=new TreeNode(3);
        root.right=new TreeNode(2);
        root.right.left=null;
        root.right.right=new TreeNode(3);
        System.out.print(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        int result=0;
        if(root==null)
            return true;
        int ldeep=maxDepth(root.left);
        int rdeep=maxDepth(root.right);
        result=ldeep-rdeep;
        if(result>1||result<-1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int maxDepth(TreeNode root) {
        int deep=0;
        if(root!=null){
            int ldeep=maxDepth(root.left);
            int rdeep=maxDepth(root.right);
            deep=Math.max(ldeep + 1, rdeep + 1);
        }
        return deep;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
