package cn.abelib.solution.five;

import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 17:25
 */
public class MaximumDepthOfNAryTree559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        if (root.children == null || root.children.size() ==0) {
            return 1;
        }
        for (Node node : root.children) {
            int max =  maxDepth(node);
            if (depth < max) {
                depth = max;
            }
        }
        return depth + 1;
    }

}
