package cn.abelib.solution.ten;

import org.junit.Test;

import java.util.Stack;

/**
 * @Author: abel.huang
 * @Date: 2019-09-11 22:26
 */
public class RemoveOutermostParentheses1021 {
    public String removeOuterParentheses(String S) {
        int len = S.length();
        if (len  < 1) {
            return S;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                if (S.charAt(i) == '('){
                    stack.push(S.charAt(i));
                }
                continue;
            }
            if (S.charAt(i) == '(') {
                stringBuilder.append('(');
                stack.push('(');
            }
            if(S.charAt(i) == ')')  {
                stack.pop();
                if (!stack.isEmpty()) {
                    stringBuilder.append(')');
                }
            }
        }
        return stringBuilder.toString();
    }

    @Test
    public void test() {
        String s1 = "(()())(())";
        System.err.println(removeOuterParentheses(s1));
        String s2 = "(()())(())(()(()))";
        System.err.println(removeOuterParentheses(s2));
        String s3 = "(()(()))";
        System.err.println(removeOuterParentheses(s3));
    }
}
