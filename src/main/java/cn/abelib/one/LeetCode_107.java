package cn.abelib.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Is same with 102th.
 */
public class LeetCode_107 {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        root.left.left=null;
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(2);
        root.right.left=null;
        root.right.right=new TreeNode(3);
        System.out.print(" "+levelOrder(root).toString());
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> lists=new ArrayList<>();
        List<List<Integer>> listt=new ArrayList<>();
        if(root==null)
            return lists;
        else {
            q.add(root);
            while(!q.isEmpty()){
                List<Integer> list=new ArrayList<>();
                int size=q.size();
                for(int i=0;i<size;i++){
                    root=q.poll();
                    list.add(root.val);
                    if(root.left!=null){
                        q.add(root.left);
                    }
                    if(root.right!=null)
                        q.add(root.right);
                }
                listt.add(list);
            }
            for(int i=listt.size()-1;i>=0;i--)
                lists.add(listt.get(i));
            return lists;
        }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
