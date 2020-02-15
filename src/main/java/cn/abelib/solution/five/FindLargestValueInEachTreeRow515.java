package cn.abelib.solution.five;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2020-02-15 03:54
 */
public class FindLargestValueInEachTreeRow515 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int max = 0;
            for (int i = 0; i < size; i++) {
                root = q.poll();
                if (i == 0) {
                    max = root.val;
                } else {
                    max = Math.max(max, root.val);
                }
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }

    @Test
    public void largestValuesTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);

        System.err.println(largestValues(root));
    }
}
