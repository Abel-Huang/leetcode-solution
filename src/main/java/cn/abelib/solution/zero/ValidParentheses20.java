package cn.abelib.solution.zero;

import java.util.Stack;

/**
 *
 * @author huangjianjin
 * @date 2016/7/11
 * goal: how to use stack in Java
 * notes:lastElement means pop rather firstElement
 */
public class ValidParentheses20 {
    public boolean isValid(String s) {
        if (s.length() < 1) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() != 0) {
                char temp = stack.lastElement();
                boolean bool = (temp == '(' && s.charAt(i) == ')')
                        || (temp == '[' && s.charAt(i) == ']')
                        || (temp == '{' && s.charAt(i) == '}');
                if (bool) {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            } else {
                stack.add(s.charAt(i));
            }
        }
        return stack.size() == 0;
    }
}
