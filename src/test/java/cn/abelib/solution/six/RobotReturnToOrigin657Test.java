package cn.abelib.solution.six;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 01:01
 */
public class RobotReturnToOrigin657Test {
    RobotReturnToOrigin657 robotReturnToOrigin657;

    @Before
    public void init() {
        robotReturnToOrigin657 = new RobotReturnToOrigin657();
    }

    @Test
    public void judgeCircle() {
        System.err.println(robotReturnToOrigin657.judgeCircle("RLUURDDDLU"));
        System.err.println(robotReturnToOrigin657.judgeCircle("LL"));
        System.err.println(robotReturnToOrigin657.judgeCircle("R"));
    }
}