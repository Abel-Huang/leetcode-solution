package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/7/28
 */
public class ValidAnagram242 {
    public static void main(String args[]) {
        String s = "rat";
        String t = "car";
        System.out.print(" " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] salphanum = new int[26];
        int[] talphanum = new int[26];
        for (int i = 0; i < 26; i++) {
            salphanum[i] = 0;
            talphanum[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            salphanum[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            talphanum[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (talphanum[i] != salphanum[i]) {
                return false;
            }
        }
        return true;
    }
}
