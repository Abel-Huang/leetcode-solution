package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;



/**
 * @author abel.huang
 * @date 2019/4/30 17:36
 */
public class ValidateBinarySearchTree98Test {
    private ValidateBinarySearchTree98 validateBinarySearchTree98;
    @Before
    public void init() {
        validateBinarySearchTree98 = new ValidateBinarySearchTree98();
    }

    @Test
    public void isValidBST() {
        ValidateBinarySearchTree98.TreeNode root = new ValidateBinarySearchTree98.TreeNode(1);
        root.left = new ValidateBinarySearchTree98.TreeNode(2);
//        root.left.left=null;
//        root.left.right=new TreeNode(3);
        root.right = new ValidateBinarySearchTree98.TreeNode(3);
//        root.right.left=null;
//        root.right.right=new TreeNode(3);
        System.out.print(validateBinarySearchTree98.isValidBST(root));
    }
}