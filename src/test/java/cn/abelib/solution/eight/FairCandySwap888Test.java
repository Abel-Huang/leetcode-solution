package cn.abelib.solution.eight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 10:47
 */
public class FairCandySwap888Test {
    FairCandySwap888 fairCandySwap888;

    @Before
    public void init() {
        fairCandySwap888 = new FairCandySwap888();
    }

    @Test
    public void fairCandySwap() {
        int[] A = {1, 2};
        int[] B = {2, 3};
        System.out.println(fairCandySwap888.fairCandySwap(A, B)[0] + " " + fairCandySwap888.fairCandySwap(A, B)[1]);
    }
}