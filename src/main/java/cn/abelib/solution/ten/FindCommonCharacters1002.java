package cn.abelib.solution.ten;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 18:46
 */
public class FindCommonCharacters1002 {
    public List<String> commonChars(String[] A) {
        List<String> results = new ArrayList<>();
        int[] map = new int[26];
        int len = A.length;
        if (len < 1) {
            return results;
        }
        if (len == 1) {
            for (int i = 0; i < A[0].length(); i++) {
                results.add(String.valueOf(A[0].charAt(i)));
            }
            return results;
        }
        for (int i = 0; i < A[0].length(); i++) {
            map[A[0].charAt(i) - 'a'] ++;
        }
        int[] compare = new int[26];
        for (int i = 1;  i < len;  i ++) {
            String str = A[i];
            if (str.length() < 1) {
                results.clear();
                return results;
            }
            for (int j = 0; j < str.length(); j++) {
                compare[str.charAt(j) - 'a'] ++;
            }
            for (int j = 0; j < 26; j++) {
                map[j] = Math.min(compare[j], map[j]);
                compare[j] = 0;
            }
        }
        for (int i = 0; i < 26;  i ++) {
            while (map[i] > 0) {
                results.add(String.valueOf((char)('a' + i)));
                map[i]--;
            }
        }
        return results;
    }


    @Test
    public void commonCharsTest() {
        String[] A1 = {"bella","label","roller"};
        System.err.println(commonChars(A1));
        String[] A2 = {"cool","lock","cook"};
        System.err.println(commonChars(A2));
    }
}
