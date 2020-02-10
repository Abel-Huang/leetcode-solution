package cn.abelib.solution.six;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-02-07 21:56
 */
public class AverageOfLevelsInBinaryTree637 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) {
            return ans;
        }
        queue.add(root);
        List<Double> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++){
                root = queue.poll();
                list.add((double) root.val);
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null) {
                    queue.add(root.right);
                }
            }
            ans.add(list.stream().reduce((a,b) -> a + b ).get() * 1.0 / list.size());
            list.clear();
        }
        return ans;
    }

    @Test
    public void averageOfLevelsTest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(20);

        averageOfLevels(root).forEach(System.err::println);

        TreeNode root2 = new TreeNode(2147483647);
        root2.left = new TreeNode(2147483647);
        root2.right = new TreeNode(2147483647);
        averageOfLevels(root2).forEach(System.err::println);
    }

}
