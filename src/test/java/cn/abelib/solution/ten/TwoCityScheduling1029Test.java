package cn.abelib.solution.ten;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 10:40
 */
public class TwoCityScheduling1029Test {
    TwoCityScheduling1029 twoCityScheduling1029;

    @Before
    public void init() {
        twoCityScheduling1029 = new TwoCityScheduling1029();
    }

    @Test
    public void twoCitySchedCost() {
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        System.err.println(twoCityScheduling1029.twoCitySchedCost(costs));
    }
}