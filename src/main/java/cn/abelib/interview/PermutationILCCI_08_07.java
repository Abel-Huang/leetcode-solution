package cn.abelib.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2021-01-18 22:27
 */
public class PermutationILCCI_08_07 {
    public String[] permutation(String S) {
        List<String> ans = new ArrayList<>();
        char[] a = S.toCharArray();
        int len = a.length;
        backtracking(ans, a, 0, len);

        String[] res = new String[ans.size()];
        for (int i = 0; i < ans.size(); i ++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    private void backtracking(List<String> ans, char[] a, int pos, int len) {
        if (pos == a.length - 1) {
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
        String s = "QWER";

       System.err.println(Arrays.toString(permutation(s)));
    }
}
