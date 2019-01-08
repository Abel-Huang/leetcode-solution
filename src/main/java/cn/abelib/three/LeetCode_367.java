package cn.abelib.three;

import java.lang.String;
import java.lang.System;

/**
 * Created by abel-huang on 2016/7/5.
 */
public class LeetCode_367 {
    public static void main(String args[]) {
        int a = 15;
        System.out.println(isPerfectSquare(a));
    }

    public static boolean isPerfectSquare(int num) {
        boolean issquare = false;
        for (int i = 0; i <= num / 2; i++) {

            if (i * i == num) {
                issquare = true;
                break;
            } else
                continue;
        }
        if (num == 1)
            issquare = true;
        return issquare;
    }
}
