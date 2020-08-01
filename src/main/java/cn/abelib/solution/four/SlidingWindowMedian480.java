package cn.abelib.solution.four;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-07-24 23:00
 */
public class SlidingWindowMedian480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;

        if (len < 1) {
            return new double[0];
        }

        if (len == 1) {
            return new double[] {nums[0]};
        }

        double[] ans = new double[len - k + 1];
//        if (len == k) {
//
//        }
        if (k == 0 || k == 1) {
            for (int i = 0; i < len; i ++) {
                ans[i] = nums[i];
            }
            return ans;
        }

        int idx = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i ++) {
            if (queue.size() != k) {
                queue.add(nums[i]);
                continue;
            }
            ans[idx ++] = findMid(new ArrayList<>(queue));
            queue.remove();
            queue.add(nums[i]);
        }
        ans[idx] = findMid(new ArrayList<>(queue));
        return ans;
    }

    double findMid(List<Integer> list) {
        int len = list.size();
        if (len == 1) {
            return list.get(0);
        }
        if (len == 2) {
            return list.get(0) / 2.0 + list.get(1) / 2.0;
        }
        Collections.sort(list);
        if (len % 2 == 1) {
            return list.get(len / 2);
        }
        return list.get(len / 2) / 2.0 + list.get(len / 2 - 1) / 2.0;
    }


    @Test
    public void medianSlidingWindowTest() {
        System.err.println(Arrays.toString(medianSlidingWindow(new int[]{1, 4, 2, 3}, 4)) );
    }
}
