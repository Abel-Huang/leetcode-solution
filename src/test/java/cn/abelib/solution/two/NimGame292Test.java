package cn.abelib.solution.two;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 20:30
 */
public class NimGame292Test {
    private NimGame292 nimGame292;

    @Before
    public void init() {
        nimGame292 = new NimGame292();
    }

    @Test
    public void canWinNim() {
        System.err.println(nimGame292.canWinNim(5));
    }
}