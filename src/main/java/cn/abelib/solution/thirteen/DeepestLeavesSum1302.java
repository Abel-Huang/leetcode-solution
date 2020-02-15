package cn.abelib.solution.thirteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 03:10
 */
public class DeepestLeavesSum1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int levelOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            list.clear();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                list.add(root.val);
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
        }
        return list.stream().reduce((x,y)->x+y).orElse(0);
    }
}
