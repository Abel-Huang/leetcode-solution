package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: abel.huang
 * @Date: 2021-01-06 21:12
 */
public class NonOverlappingIntervals435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        int ans = 0;
        int len = intervals.length;
        if (len < 2) {
            return ans;
        }
        int[] prev = intervals[0];
        for (int i = 1; i < len; i ++) {
            int[] interval = intervals[i];
            if (interval[0] >= prev[1]) {
                prev = interval;
            } else {
                ans ++;
            }
        }
        return ans;
    }


    @Test
    public void eraseOverlapIntervalsTest() {
        int[][] intervals = {{1, 3}, {1, 2}, {2, 4}, {1, 4}};
        System.err.println(eraseOverlapIntervals(intervals));
    }
}
