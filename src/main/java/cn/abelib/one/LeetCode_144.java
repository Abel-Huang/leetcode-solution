package cn.abelib.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/8.
 * A preordertraversal use stack.
 */
public class LeetCode_144 {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        root.left.left=null;
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(2);
        root.right.left=null;
        root.right.right=new TreeNode(3);
        List<Integer> list=preorderTraversal(root);
        for(int i: list){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null)
            return list;
        else
            stack.push(root);
        while(!stack.empty()){
            root=stack.pop();
            list.add(root.val);
            if(root.right!=null)
                stack.push(root.right);
            if(root.left!=null)
                stack.push(root.left);
        }
        return list;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
