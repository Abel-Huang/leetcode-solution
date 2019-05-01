package cn.abelib.solution.seven;

/**
 *
 * @author abel
 * @date 2018/5/27
 * Accept 29.03%
 */
public class RotateString796 {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            return true;
        }
        if (A.length() == 1) {
            return false;
        }
        int len = A.length();
        for (int i = 0; i < len; i++) {
            A = A.substring(1, len) + A.charAt(0);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.err.println(new RotateString796().rotateString("abcde", "cdeab"));
        System.err.println(new RotateString796().rotateString("abcde", "abced"));
    }
}
