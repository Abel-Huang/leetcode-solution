package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-12-09 22:33
 */
public class LetterCombinationsOfAPhoneNumber17 {
    private String[] letters = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    private List<String> res;

    /**
     * @param digits 原始字符串
     * @param index 当前处理的索引
     * @param s 已经生成的字符串
     */
    void findCombination(String digits, int index, String s) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }
        char c = digits.charAt(index) ;
        String numLetters = letters[c - '0'];
        for (int i = 0; i < numLetters.length(); i ++) {
            findCombination(digits, index + 1, s + numLetters.charAt(i));
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits == null || "".equals(digits)) {
            return res;
        }
        findCombination(digits, 0, "");
        return res;
    }

    @Test
    public void letterCombinationsTest() {
        System.err.println(letterCombinations("234"));
    }
}
