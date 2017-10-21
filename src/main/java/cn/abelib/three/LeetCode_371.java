package cn.abelib.three;

import java.lang.String;import java.lang.System;
/**
 * Created by abel-huang on 2016/7/5.
 */
public class LeetCode_371 {
    public static void main(String args[]){
        int a=3,b=43;
        System.out.println("result is "+getSum(a,b));
    }
    public static int getSum(int a, int b) {
        int result;
        result=(a^b)+((a&b)<<1);
        return result;
    }
}