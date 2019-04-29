package cn.abelib.solution.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by abel-huang on 2016/8/9.
 * This because I every time I point to the same list object, and when I use
 * the object I change the value of the object, so when I need use the original list
 * I should new a arraylist and add all elements to this one rather than point it to the
 * original one.
 * It takes me about three hours troubleshooting this problems, I'm so sad.
 */
public class LeetCode_113 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.left.left=new TreeNode(2);
//        root.left.right=new TreeNode(2);
        root.right = new TreeNode(3);
//        root.right.left=new TreeNode(2);
//        root.right.right=new TreeNode(2);
        int sum = 4;
        System.out.print(pathSumm(root, sum).toString());
    }

    public static List<List<Integer>> pathSumm(TreeNode root, int sum) {
        HashMap<TreeNode, List<Integer>> hashMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        } else {
            stack.push(root);
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            hashMap.put(root, list);
            while (!stack.empty()) {
                root = stack.pop();
                list = hashMap.get(root);
                if (root.right != null) {
                    stack.push(root.right);
                    List<Integer> listt = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++)
                        listt.add(list.get(i));
                    listt.add(root.right.val);
                    hashMap.put(root.right, listt);
                }
                if (root.left != null) {
                    stack.push(root.left);
                    List<Integer> lists = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++)
                        lists.add(list.get(i));
                    lists.add(root.left.val);
                    hashMap.put(root.left, lists);
                }
                if (root.left == null && root.right == null) {
                    int total = 0;
                    for (int i = 0; i < hashMap.get(root).size(); i++)
                        total += hashMap.get(root).get(i);
                    if (total == sum)
                        result.add(hashMap.get(root));
                }
            }
            return result;
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
