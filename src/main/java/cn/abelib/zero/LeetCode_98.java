package cn.abelib.zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/1.
 * Use inorder_travel, if the order number is bigger than the pre_one,
 * and this is a validBST.
 */
public class LeetCode_98 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.left.left=null;
//        root.left.right=new TreeNode(3);
        root.right = new TreeNode(3);
//        root.right.left=null;
//        root.right.right=new TreeNode(3);
        System.out.print(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
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
        if (list.isEmpty() || list.size() == 1)
            return true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
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
