package cn.abelib.one;
/**
 * Created by abel-huang on 2016/8/1.
 * The left_tree equals right_tree.
 */
public class LeetCode_100 {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        //System.out.print(rob(nums));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        else if(p==null||q==null){
            return false;
        }
        else{

            if(p.val!=q.val){
                return false;
            }
            if(isSameTree(p.left,q.left)&&isSameTree(p.right,q.right))
                return true;
            else{
                return false;
            }
        }
    }
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
