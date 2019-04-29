package cn.abelib.solution.one;

/**
 * Created by abel-huang on 2016/7/29.
 */
public class LeetCode_125 {
    public static void main(String args[]) {
        String s = "Q1";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 1)
            return true;
        int front = 0, end = s.length() - 1;
        while (front <= end) {
            while (!((s.charAt(front) >= 'a' && s.charAt(front) <= 'z') || (s.charAt(front) >= 'A' && s.charAt(front) <= 'Z') || (s.charAt(front) >= '0' && s.charAt(front) <= '9')) && (front < end && end < s.length()))
                front++;
            while (!((s.charAt(end) >= 'a' && s.charAt(end) <= 'z') || (s.charAt(end) >= 'A' && s.charAt(end) <= 'Z') || (s.charAt(end) >= '0' && s.charAt(end) <= '9')) && (front < end && end < s.length()))
                end--;
            if (s.charAt(end) == s.charAt(front)) {
                front++;
                end--;
            } else {
                if (s.charAt(end) > s.charAt(front) && !((s.charAt(end) == s.charAt(front) + 32) && s.charAt(front) > '9'))
                    return false;
                if (s.charAt(end) < s.charAt(front) && !((s.charAt(end) == s.charAt(front) - 32) && s.charAt(end) > '9'))
                    return false;
                front++;
                end--;
            }
        }
        return true;
    }
}
