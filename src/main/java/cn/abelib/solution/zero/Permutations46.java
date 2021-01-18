package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-08-01 02:45
 */
public class Permutations46 {

    List<List<Integer>> ans = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> track = new ArrayList<>();
        used = new boolean[nums.length];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
        backtrack(nums, track);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> track) {
        if (nums.length == track.size()) {
            ans.add(new ArrayList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i ++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            track.add(nums[i]);
            backtrack(nums, track);
            track.remove(track.size() - 1);
            used[i] = false;
        }
    }

    @Test
    public void permuteTest() {
        System.err.println(permute(new int[]{1, 2, 3}));
    }
}
