package cn.abelib.solution.eight;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:15
 */
public class PositionsOfLargeGroups830Test {
    private PositionsOfLargeGroups830 positionsOfLargeGroups830;

    @Before
    public void init() {
        positionsOfLargeGroups830 = new PositionsOfLargeGroups830();
    }

    @Test
    public void largeGroupPositions() {
        String S= "aaaaa";
        System.out.println(positionsOfLargeGroups830.largeGroupPositions(S));
    }
}