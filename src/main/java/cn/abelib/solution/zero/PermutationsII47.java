package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: abel.huang
 * @Date: 2020-08-01 17:06
 */
public class PermutationsII47 {
    Set<List<Integer>> ans = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<Integer> track = new ArrayList<>();
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backtrack(numList, track, len);
        return new ArrayList<>(ans);
    }

    private void backtrack(List<Integer> nums, List<Integer> track, int len) {
        if (len == track.size()) {
            ans.add(new ArrayList<>(track));
            return;
        }

        for (int i = 0; i < nums.size(); i ++) {
            track.add(nums.get(i));
            List<Integer> next = new ArrayList<>(nums);
            next.remove(i);
            backtrack(next, track, len);
            int size = track.size();
            track.remove(size - 1);
        }
    }

    @Test
    public void permuteTest() {
        System.err.println(permuteUnique(new int[]{12222, 12222, 333333333}));
    }
}
