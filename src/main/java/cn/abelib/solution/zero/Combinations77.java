package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2021-01-17 18:41
 */
public class Combinations77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>(k);
        int count = 0;
        backtracking(ans, comb, count, 1, n, k);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> comb, int count, int pos, int n, int k) {
        if (count == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = pos; i <= n; i ++) {
            comb.add(i);
            count ++;
            backtracking(ans, comb, count, i + 1, n , k);
            count --;
            comb.remove(count);
        }
    }

    @Test
    public void combineTest() {
        System.err.println(combine(4, 3));
    }
}
