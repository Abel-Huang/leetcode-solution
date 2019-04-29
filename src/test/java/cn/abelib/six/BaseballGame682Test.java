package cn.abelib.six;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 23:05
 */
public class BaseballGame682Test {
    BaseballGame682 baseballGame682;
    @Before
    public void init() {
        baseballGame682 = new BaseballGame682();
    }

    @Test
    public void calPoints() {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.err.println(baseballGame682.calPoints(ops));
        String[] ops1 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.err.println(baseballGame682.calPoints(ops1));
    }
}