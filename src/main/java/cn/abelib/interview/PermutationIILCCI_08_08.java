package cn.abelib.interview;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2021-01-18 23:25
 */
public class PermutationIILCCI_08_08 {
    public String[] permutation(String S) {
        Set<String> ans = new HashSet<>();
        char[] a = S.toCharArray();
        int len = a.length;
        backtracking(ans, a, 0, len);

        String[] res = new String[ans.size()];
        Iterator<String> iterator = ans.iterator();
        for (int i = 0; i < ans.size(); i ++) {
            res[i] = iterator.next();
        }
        return res;
    }

    private void backtracking(Set<String> ans, char[] a, int pos, int len) {
        if (pos == len - 1) {
            ans.add(new String(a));
            return;
        }
        for (int i = pos; i < len; i ++) {
            swap(a, i, pos);
            backtracking(ans, a,pos + 1, len);
            swap(a, i, pos);
        }
    }

    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    @Test
    public void permutationTest() {
        String s = "qqee";

        System.err.println(Arrays.toString(permutation(s)));
    }
}
