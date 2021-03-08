package cn.abelib.point;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-04-13 23:25
 */
public class PointToOffer32 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> temp = new LinkedList<>();
        queue.add(root);

        while (true) {
            List<Integer> item = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            ans.add(item);
            if (temp.isEmpty()) {
                break;
            }
            queue.addAll(temp);
            temp.clear();

        }
        return ans;
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.err.println(levelOrder(root));
    }

    @Test
    public void test2() {


    }
}
