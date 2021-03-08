package cn.abelib.point;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-08-01 15:02
 */
public class Permutation38 {
    Set<String> set = new HashSet<>();

    public String[] permutation(String s) {
        int len = s.length();
        List<Character> characters = new ArrayList<>();
        backtracking(s, characters, len);
        return set.stream().toArray(String[]::new);
    }

    private void backtracking(String s, List<Character> characters, int len) {
        if (len == characters.size()) {
            StringBuilder sb = new StringBuilder();
            for (char c : characters) {
                sb.append(c);
            }
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < s.length(); i ++) {
            characters.add(s.charAt(i));
            backtracking(s.substring(0, i) + s.substring(i + 1), characters, len);

            int idx = characters.size();
            characters.remove(idx - 1);
        }
    }

    public String[] permutation2(String s) {
        Set<String> set = new HashSet<>();
        int len = s.length();
        char[] a = s.toCharArray();
        backtracking(a, set, 0, len);
        return set.stream().toArray(String[]::new);
    }

    private void backtracking(char[] a, Set<String> set, int pos, int len) {
        if (pos == a.length - 1) {
            set.add(new String(a));
            return;
        }
        for (int i = pos; i < len; i ++) {
            swap(a, i, pos);
            backtracking(a, set, pos + 1, len);
            swap(a, i, pos);
        }
    }

    public void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    @Test
    public void permutationTest() {
        System.err.println(Arrays.toString(permutation2("aac")));
        int[] a = new int[2];
        System.err.println(a.length);
    }
}
