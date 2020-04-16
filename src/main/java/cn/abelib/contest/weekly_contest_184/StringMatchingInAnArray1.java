package cn.abelib.contest.weekly_contest_184;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2020-04-12 10:36
 */
public class StringMatchingInAnArray1 {
    public List<String> stringMatching(String[] words) {
        int len = words.length;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < len; j ++ ) {
                if (j != i && words[i].contains(words[j])) {
                    set.add(words[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    @Test
    public void test1() {
       String[]  words = {"leetcode","et","code"};
       System.err.println(stringMatching(words));
    }

    @Test
    public void test2() {
        String[]  words = {"mass","as","hero","superhero"};
        System.err.println(stringMatching(words));
    }
}
