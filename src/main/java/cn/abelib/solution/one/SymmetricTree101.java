package cn.abelib.solution.one;

import org.junit.Test;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/8/11
 *
 */
public class SymmetricTree101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.right == null && root.left == null) {
            return true;
        }
        if (root.right == null || root.left == null) {
            return false;
        }
        if (!inorderLeft(root.left).equals(inorderRight(root.right))) {
            return false;
        }
        for (int i = 0; i < levelOrder(root).size(); i++) {
            for (int j = 0; j < levelOrder(root).get(i).size(); j++) {
                if (!levelOrder(root).get(i).get(j).equals(levelOrder(root).get(i).get(levelOrder(root).get(i).size() - j - 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        else {
            q.add(root);
            while (!q.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    root = q.poll();
                    list.add(root.val);
                    if (root.left != null) {
                        q.add(root.left);
                    }
                    if (root.right != null)
                        q.add(root.right);
                }
                lists.add(list);
            }
            return lists;
        }
    }

    public  List<Integer> inorderLeft(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.empty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            if (!stack.empty()) {
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.right;
            }
        }
        return list;
    }

    public  List<Integer> inorderRight(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.empty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.right;
            }
            if (!stack.empty()) {
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.left;
            }
        }
        return list;
    }

    /**
     * 递归实现
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val
                && isSymmetric(node1.left, node2.right)
                && isSymmetric(node1.right, node2.left);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        //   root.left.right=new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        //    root.right.right=new TreeNode(3);
//        for(int i:inorderLeft(root))
//            System.out.print(i+" ");
//        System.out.println(" ");
//        for(int i:inorderRight(root))
//            System.out.print(i+" ");
        System.out.print(isSymmetric(root));
    }
}
