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

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> track = new ArrayList<>();
        backtrack(nums, track);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> track) {
        if (nums.length == track.size()) {
            ans.add(new ArrayList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i ++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, track);
            int size = track.size();
            track.remove(size - 1);
        }
    }

    @Test
    public void permuteTest() {
        System.err.println(permute(new int[]{1, 2, 3}));
    }
}
