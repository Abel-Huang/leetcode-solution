package cn.abelib.solution.ten;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 10:06
 */
public class PartitionArrayIntoThreePartsWithEqualSum1013Test {
    PartitionArrayIntoThreePartsWithEqualSum1013 partitionArray;

    @Before
    public void init() {
        partitionArray = new PartitionArrayIntoThreePartsWithEqualSum1013();
    }

    @Test
    public void canThreePartsEqualSum() {
        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
        System.err.println(partitionArray.canThreePartsEqualSum(A));
        int[] A1 = {3,3,6,5,-2,2,5,1,-9,4};
        System.err.println(partitionArray.canThreePartsEqualSum(A1));
        int[] A2 = {0,2,1,-6,6,7,9,-1,2,0,1};
        System.err.println(partitionArray.canThreePartsEqualSum(A2));
    }
}