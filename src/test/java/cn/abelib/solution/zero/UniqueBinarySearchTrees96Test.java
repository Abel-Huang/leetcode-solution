package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 17:37
 */
public class UniqueBinarySearchTrees96Test {
    private UniqueBinarySearchTrees96 uniqueBinarySearchTrees96;
    @Before
    public void setUp() {
        uniqueBinarySearchTrees96 = new UniqueBinarySearchTrees96();
    }

    @Test
    public void numTrees() {
        System.out.print(uniqueBinarySearchTrees96.numTrees(3));
    }
}