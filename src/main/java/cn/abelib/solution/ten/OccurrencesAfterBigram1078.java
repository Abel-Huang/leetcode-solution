package cn.abelib.solution.ten;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2019-09-21 14:09
 */
public class OccurrencesAfterBigram1078 {
    public String[] findOcurrences(String text, String first, String second) {
        if (text.length() < 1) {
            return new String[0];
        }
        String[] texts = text.split(" ");
        if (texts.length < 3) {
            return new String[0];
        }

        List<String> list = new LinkedList<>();
        for (int i = 0; i < texts.length - 2; i ++) {
            if (texts[i].equals(first) && texts[i + 1].equals(second)) {
                list.add(texts[i + 2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    @Test
    public void findOcurrencesTest() {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        //System.err.println(Arrays.toString(findOcurrences(text, first, second)));

        String text1 ="ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv ypkk", first1 = "lnlqhmaohv", second1 = "ypkk";
        System.err.println(Arrays.toString(findOcurrences(text1, first1, second1)));

    }
}
