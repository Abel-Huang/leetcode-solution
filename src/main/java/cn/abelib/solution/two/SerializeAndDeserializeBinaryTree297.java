package cn.abelib.solution.two;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-02-09 23:37
 */
public class SerializeAndDeserializeBinaryTree297 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        /**
         * Encodes a tree to a single string.
         * @param root
         * @return
         */
        public String serialize(TreeNode root) {
            StringBuilder res = serializeHelper(root, new StringBuilder());
            return res.toString();
        }

        public StringBuilder serializeHelper(TreeNode root, StringBuilder str){
            if(null == root){
                str.append("null,");
                return str;
            }
            str.append(root.val);
            str.append(",");
            str = serializeHelper(root.left, str);
            str = serializeHelper(root.right, str);
            return str;
        }
        /**
         * ecodes your encoded data to tree.
         * @param data
         * @return
         */
        public TreeNode deserialize(String data) {
            if (data.length() < 1) {
                return null;
            }
            String[] datas = data.split(",");
            List<String> dataList = new LinkedList<>(Arrays.asList(datas));
            return deserializeHelper(dataList);
        }

        public TreeNode deserializeHelper(List<String> list) {
            if (list.size() < 1) {
                return null;
            }
            if (list.get(0).equals("null")) {
                list.remove(0);
                return null;
            }
            TreeNode node = new TreeNode(Integer.valueOf(list.get(0)));
            list.remove(0);
            node.left = deserializeHelper(list);
            node.right = deserializeHelper(list);
            return node;
        }
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Codec codec = new Codec();

        System.err.println(codec.serialize(root));
        codec.deserialize(codec.serialize(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(3);
        root.right.left.right = new TreeNode(1);
        Codec codec = new Codec();

        System.err.println(codec.serialize(root));
        codec.deserialize(codec.serialize(root));
    }
}
