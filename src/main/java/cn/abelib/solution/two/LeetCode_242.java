package cn.abelib.solution.two;

/**
 * Created by  abel-huang on 2016/7/28.
 * we can use two ways to solve this question��
 * 1. Sort two strings with alphabeta table, and whether the two string is equal.
 * 2. Count every element's number and save in an array whether each element of
 * the two arrays are equal.
 */
public class LeetCode_242 {
    public static void main(String args[]) {
        String s = "rat";
        String t = "car";
        System.out.print(" " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int salphanum[] = new int[26];
        int talphanum[] = new int[26];
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
            if (talphanum[i] != salphanum[i])
                return false;
        }
        return true;
    }
}
