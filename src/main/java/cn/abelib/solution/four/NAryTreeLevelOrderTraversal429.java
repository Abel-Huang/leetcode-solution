package cn.abelib.solution.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        result.add(Collections.singletonList(root.val));

        for (Node node : root.children) {
            result.addAll(levelOrder(node));
        }
        return result;
    }
}
