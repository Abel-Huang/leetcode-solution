package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2021-01-17 23:28
 */
public class CombinationSum40 {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        int current = 0;
        backtracking(ans, comb, current, 0, candidates, target);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> comb, int current, int pos, int[] candidates, int target) {
        if (current == target && !set.contains(comb)) {
            set.add(comb);
            ans.add(new ArrayList<>(comb));
            return;
        } else if (current > target) {
            return;
        }
        for (int i = pos; i < candidates.length; i ++) {
            comb.add(candidates[i]);
            current += candidates[i];
            backtracking(ans, comb, current, i + 1, candidates, target);
            current -= candidates[i];
            int idx = comb.size() - 1;
            comb.remove(idx);
        }
    }

    @Test
    public void combinationSumTest() {
        int[] candidates = {2,5,2,1, 2};
        System.err.println(combinationSum2(candidates, 5));
    }
}