package cn.abelib.solution.three;

import java.lang.String;
import java.lang.System;

/**
 *
 * @author abel-huang
 * @date 2016/7/5
 */
public class SumOfTwoIntegers371 {
    public static void main(String[] args) {
        int a = 3, b = 43;
        System.out.println("result is " + getSum(a, b));
    }

    public static int getSum(int a, int b) {
        return (a ^ b) + ((a & b) << 1);
    }
}