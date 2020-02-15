package cn.abelib.solution.five;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 02:20
 */
public class FindBottomLeftTreeValue513 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int ans = 0;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                if (i == 0) {
                    ans = root.val;
                }
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
        }
        return ans;
    }

    @Test
    public void findBottomLeftValueTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        System.out.print(findBottomLeftValue(root));
    }
}
