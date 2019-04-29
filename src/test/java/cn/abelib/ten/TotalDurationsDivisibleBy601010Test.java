package cn.abelib.ten;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 01:34
 */
public class TotalDurationsDivisibleBy601010Test {
    TotalDurationsDivisibleBy601010 totalDurationsDivisibleBy601010;
    @Before
    public void init() {
        totalDurationsDivisibleBy601010 = new TotalDurationsDivisibleBy601010();
    }

    @Test
    public void numPairsDivisibleBy60() {
        int[] times = {30,20,150,100,40};
        System.err.println(totalDurationsDivisibleBy601010.numPairsDivisibleBy60(times));
        int[] times1 = {15,63,451,213,37,209,343,319};
        System.err.println(totalDurationsDivisibleBy601010.numPairsDivisibleBy60(times1));
        int[] times2 = {418,204,77,278,239,457,284,263,372,279,476,416,360,18};
        System.err.println(totalDurationsDivisibleBy601010.numPairsDivisibleBy60(times2));
        int[] times3 = {60,60,60};
        System.err.println(totalDurationsDivisibleBy601010.numPairsDivisibleBy60(times3));
    }
}