package cn.abelib.eight;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 23:21
 */
public class NumberOfLinesToWriteString806Test {
    NumberOfLinesToWriteString806 numberOfLinesToWriteString806;

    @Before
    public void init() {
        numberOfLinesToWriteString806 = new NumberOfLinesToWriteString806();
    }

    @Test
    public void numberOfLines() {
        int[] widtgs = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        System.err.println(Arrays.toString(numberOfLinesToWriteString806.numberOfLines(widtgs, "bbbcccdddaaa")) );
    }

    @Test
    public void numberOfLines2() {
        int[] widtgs = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        System.err.println(Arrays.toString(numberOfLinesToWriteString806.numberOfLines(widtgs, "abcdefghijklmnopqrstuvwxyz")) );
    }
}