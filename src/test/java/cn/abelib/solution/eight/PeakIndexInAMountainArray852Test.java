package cn.abelib.solution.eight;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-05-01 23:31
 */
public class PeakIndexInAMountainArray852Test {
    private PeakIndexInAMountainArray852 peakIndexInAMountainArray;
    @Before
    public void init() {
        peakIndexInAMountainArray = new PeakIndexInAMountainArray852();
    }

    @Test
    public void peakIndexInMountainArray() {
        int[] A = {0, 1, 0};
        System.err.println(peakIndexInAMountainArray.peakIndexInMountainArray(A));
        int[] A1 = {0, 2, 1, 0};
        System.err.println(peakIndexInAMountainArray.peakIndexInMountainArray(A1));
    }
}