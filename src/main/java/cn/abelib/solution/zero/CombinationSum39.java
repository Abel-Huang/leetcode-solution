package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2021-01-17 23:28
 */
public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        int current = 0;
        backtracking(ans, comb, current, 0, candidates, target);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> comb, int current, int pos, int[] candidates, int target) {
        if (current == target) {
            ans.add(new ArrayList<>(comb));
            return;
        } else if (current > target) {
            return;
        }
        for (int i = pos; i < candidates.length; i ++) {
            comb.add(candidates[i]);
            current += candidates[i];
            backtracking(ans, comb, current, i, candidates, target);
            current -= candidates[i];
            int idx = comb.size() - 1;
            comb.remove(idx);
        }
    }

    @Test
    public void combinationSumTest() {
        int[] candidates = {2, 3};
        System.err.println(combinationSum(candidates, 4));
    }
}