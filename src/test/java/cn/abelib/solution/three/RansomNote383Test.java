package cn.abelib.solution.three;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:05
 */
public class RansomNote383Test {
    RansomNote383 ransomNote383;

    @Before
    public void init() {
        ransomNote383 = new RansomNote383();
    }

    @Test
    public void canConstruct() {
        System.err.println(ransomNote383.canConstruct("aa", "aab"));
        System.err.println(ransomNote383.canConstruct("aa", "bb"));
        System.err.println(ransomNote383.canConstruct("aa", "abb"));
    }
}