package cn.abelib.solution.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 00:17
 */
public class NAryTreeLevelOrderTraversal429 {
    /**
     * Definition for a Node.
     */
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        Queue<Node> level = new LinkedList<>();
        queue.add(root);

        while (true) {
            List<Integer> item = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                item.add(node.val);

                for (Node child : node.children) {
                    if (child != null) {
                        level.add(child);
                    }
                }
            }
            ans.add(item);
            if (level.isEmpty()) {
                break;
            }
            queue.addAll(level);
            level.clear();

        }
        
        return ans;
    }


}
