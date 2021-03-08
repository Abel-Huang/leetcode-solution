package cn.abelib.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2021-03-08 22:10
 * 二叉树的层次遍历，广度优先算法
 */
public class ListOfDepthLCCI_04_03 {
    class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) {
            return new ListNode[0];
        }
        List<List<TreeNode>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> level = new LinkedList<>();
        queue.add(tree);

        while (true) {
            List<TreeNode> item = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                item.add(node);

                if (node.left != null) {
                    level.add(node.left);

                }
                if (node.right != null) {
                    level.add(node.right);
                }
            }
            ans.add(item);
            if (level.isEmpty()) {
                break;
            }
            queue.addAll(level);
            level.clear();

        }
        ListNode[] listNodes = new ListNode[ans.size()];
        for (int i = 0; i < ans.size(); i ++) {
            ListNode root =  new ListNode(ans.get(i).get(0).val);
            listNodes[i] = root;
            for (int j = 1; j < ans.get(i).size(); j ++) {
                root.next = new ListNode(ans.get(i).get(j).val);
                root = root.next;
            }
        }
        return listNodes;
    }

    public ListNode[] listOfDepth2(TreeNode tree) {
        if (tree == null) {
            return new ListNode[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> level = new LinkedList<>();
        queue.add(tree);
        List<ListNode> nodes = new ArrayList<>();
        while (true) {
            boolean init = true;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();

                if (init) {
                    ListNode root = new ListNode(node.val);
                    nodes.add(root);
                    init = false;
                } else {
                    ListNode root = nodes.get(nodes.size() - 1);
                    while (root.next != null) {
                        root = root.next;
                    }
                    root.next = new ListNode(node.val);
                }
                if (node.left != null) {
                    level.add(node.left);

                }
                if (node.right != null) {
                    level.add(node.right);
                }
            }

            if (level.isEmpty()) {
                break;
            }
            queue.addAll(level);
            level.clear();

        }
        ListNode[] listNodes = new ListNode[nodes.size()];
        for (int i = 0; i < nodes.size(); i ++) {
            listNodes[i] = nodes.get(i);
        }
        return listNodes;
    }
}
