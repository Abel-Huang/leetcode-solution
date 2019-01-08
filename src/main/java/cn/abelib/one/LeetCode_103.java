package cn.abelib.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by abel-huang on 2016/8/18.
 * The same with 102th, Use a queue to breath_first_travel,
 * and save the length.
 */
public class LeetCode_103 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.print(" " + zigzagLevelOrder(root).toString());
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        else {
            q.add(root);
            int deepth = 0;
            while (!q.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    root = q.poll();
                    if (deepth % 2 == 0)
                        list.add(root.val);
                    else
                        list.add(0, root.val);
                    if (root.left != null) {
                        q.add(root.left);
                    }
                    if (root.right != null)
                        q.add(root.right);
                }
                deepth++;
                lists.add(list);
            }
            return lists;
        }
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
