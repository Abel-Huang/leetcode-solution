package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 16:49
 */
public class ClimbingStairs70Test {
    private ClimbingStairs70 climbingStairs70;
    @Before
    public void init() {
        climbingStairs70 = new ClimbingStairs70();
    }

    @Test
    public void climbStairs() {
        int a = 4;
        System.out.println(climbingStairs70.climbStairs(a));
    }
}