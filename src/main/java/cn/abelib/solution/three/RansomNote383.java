package cn.abelib.solution.three;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:00
 */
public class RansomNote383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() < 1) {
            return true;
        }
        if (magazine.length() < 1) {
            return false;
        }
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--map[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
