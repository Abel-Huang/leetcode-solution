package cn.abelib.solution.nine;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 00:35
 */
public class LargestPerimeterTriangle976Test {
    LargestPerimeterTriangle976 largestPerimeterTriangle976;

    @Before
    public void init() {
        largestPerimeterTriangle976 = new LargestPerimeterTriangle976();
    }

    @Test
    public void largestPerimeter() {
        int[] A = {3,6,2,3};
        System.err.println(largestPerimeterTriangle976.largestPerimeter(A));
    }
}