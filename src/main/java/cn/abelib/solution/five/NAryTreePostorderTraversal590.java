package cn.abelib.solution.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-09-20 23:34
 */
public class NAryTreePostorderTraversal590 {
    /**
     * Definition for a Node.
     */
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        for (Node node : root.children) {
            result.addAll(postorder(node));
        }
        result.add(root.val);
        return result;
    }
}
