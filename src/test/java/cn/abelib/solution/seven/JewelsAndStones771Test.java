package cn.abelib.solution.seven;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:34
 */
public class JewelsAndStones771Test {
    private JewelsAndStones771 jewelsAndStones771;

    @Before
    public void init() {
        jewelsAndStones771 = new JewelsAndStones771();
    }

    @Test
    public void numJewelsInStones() {
        System.err.println(jewelsAndStones771.numJewelsInStones("aA", "aAAbbbb"));
        System.err.println(jewelsAndStones771.numJewelsInStones("z", "ZZ"));
    }
}