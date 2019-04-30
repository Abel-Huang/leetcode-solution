package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/15
 * if a number is negative, it will not be a palindrome
 */
public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = x + "";
        int front = 0, end = s.length() - 1;
        boolean flag = true;
        while (front <= end) {
            if (s.charAt(front) != s.charAt(end)) {
                flag = false;
                break;
            }
            front++;
            end--;
        }
        return flag;
    }
}
