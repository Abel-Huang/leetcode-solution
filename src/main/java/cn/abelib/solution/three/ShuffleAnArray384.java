package cn.abelib.solution.three;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: abel.huang
 * @Date: 2020-02-19 00:27
 */
public class ShuffleAnArray384 {
    class Solution {
        int[] source;
        public Solution(int[] nums) {
            source = nums;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return source;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            List<Integer> ans = Arrays.stream(source).boxed().collect(Collectors.toList());
            Collections.shuffle(ans);
            return ans.stream().mapToInt(x -> x).toArray();
        }
    }


    @Test
    public void test() {
        int[] nums = {1, 2, 3};
        Solution obj = new Solution(nums);
        int[] reset = obj.reset();
        int[] shuffle = obj.shuffle();
        System.err.println(Arrays.toString(reset));
        System.err.println(Arrays.toString(shuffle));
    }
}
