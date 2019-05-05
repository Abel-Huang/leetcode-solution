package cn.abelib.explore.alg;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/5/5 8:53
 */
public class DynamicProgramming1Test {
    private DynamicProgramming1 dynamicProgramming1;
    @Before
    public void init()  {
        dynamicProgramming1 = new DynamicProgramming1();
    }

    @Test
    public void climbStairs() {
        System.out.println(dynamicProgramming1.climbStairs(4));
    }
}