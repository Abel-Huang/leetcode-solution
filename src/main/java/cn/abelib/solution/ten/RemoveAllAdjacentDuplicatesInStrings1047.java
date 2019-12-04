package cn.abelib.solution.ten;

import org.junit.Test;

import java.util.Stack;

/**
 * @Author: abel.huang
 * @Date: 2019-12-04 00:06
 */
public class RemoveAllAdjacentDuplicatesInStrings1047 {
    public String removeDuplicates(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString();
    }

    @Test
    public void removeDuplicatesTest() {
        String s1 = "abbaca";
        System.err.println(removeDuplicates(s1));
        String s2 = "cabbaca";
        System.err.println(removeDuplicates(s2));
    }
}
