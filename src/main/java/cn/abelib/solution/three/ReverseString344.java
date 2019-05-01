package cn.abelib.solution.three;

/**
 *
 * @author abel-huang
 * @date 2016/7/5
 */
public class ReverseString344 {
    public static void main(String args[]) {
        String s = "hello";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        char[] temp = new char[s.length()];
        String result;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            temp[i] = chars[j];
        }
        result = new String(temp);
        return result;
    }

    /**
     * todo
     * @param s
     */
    public void reverseString(char[] s) {

    }
}
