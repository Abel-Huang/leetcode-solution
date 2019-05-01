package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author abel-huang
 * @date 2016/8/1
 */
public class ValidateBinarySearchTree98 {

    public boolean isValidBST(TreeNode root) {
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
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
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
