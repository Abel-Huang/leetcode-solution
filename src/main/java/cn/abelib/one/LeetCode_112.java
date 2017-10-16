package cn.abelib.one;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/9.
 * Use a hashmap to save every node path's sum, if
 * the node is the leaf, confirm if the sum is equals to
 * the target.
 */
public class LeetCode_112 {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(2);
//        root.left.right=new TreeNode(2);
//        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(2);
//        root.right.right=new TreeNode(2);
        int sum=3;
        System.out.print(hasPathSum(root,sum));
    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        HashMap<TreeNode,Integer> hashMap=new HashMap<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return false;
        }
        else{
            stack.push(root);
            hashMap.put(root,root.val);
            while(!stack.empty()){
                root=stack.pop();
                if(root.right!=null){
                    stack.push(root.right);
                    hashMap.put(root.right,hashMap.get(root)+root.right.val);
                }
                if(root.left!=null){
                    stack.push(root.left);
                    hashMap.put(root.left,hashMap.get(root)+root.left.val);
                }
                if(root.left==null&&root.right==null){
                    if (hashMap.get(root)==sum)
                        return true;
                }
            }
            return false;
        }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
