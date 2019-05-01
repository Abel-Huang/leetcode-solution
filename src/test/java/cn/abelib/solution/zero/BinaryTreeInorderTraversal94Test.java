package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;



/**
 * @author abel.huang
 * @date 2019/4/30 17:39
 */
public class BinaryTreeInorderTraversal94Test {
    private BinaryTreeInorderTraversal94 binaryTreeInorderTraversal94;

    @Before
    public void init() {
        binaryTreeInorderTraversal94 = new BinaryTreeInorderTraversal94();
    }

    @Test
    public void inorderTraversal() {
        BinaryTreeInorderTraversal94.TreeNode root = new BinaryTreeInorderTraversal94.TreeNode(1);
        root.left = new BinaryTreeInorderTraversal94.TreeNode(1);
        root.left.left = null;
        root.left.right = new BinaryTreeInorderTraversal94.TreeNode(3);
        root.right = new BinaryTreeInorderTraversal94.TreeNode(2);
        root.right.left = null;
        root.right.right = new BinaryTreeInorderTraversal94.TreeNode(3);
        System.out.println(binaryTreeInorderTraversal94.inorderTraversal(root));
    }
}