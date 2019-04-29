package cn.abelib.solution.nine;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 01:08
 */
public class ReverseOnlyLetters917 {
    public String reverseOnlyLetters(String S) {
        if (S.length() < 2) {
            return S;
        }
        int left = 0;
        int right = S.length() - 1;
        char[] result = new char[S.length()];
        while (left <= right) {
            while (!isLetter(S.charAt(left)) && left < right) {
                result[left] = S.charAt(left);
                left ++;
            }
            while (!isLetter(S.charAt(right))  && left < right) {
                result[right] = S.charAt(right);
                right --;
            }
            result[left] = S.charAt(right);
            result[right] = S.charAt(left);
            left ++;
            right--;
        }
        return new String(result);
    }

    private boolean isLetter(char c) {
        return (c - 'a' >= 0 && c - 'a' < 26) || (c - 'A' >= 0 && c - 'A' < 26);
    }
}
