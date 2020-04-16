package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: abel.huang
 * @Date: 2020-04-16 21:22
 */
public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len < 2) {
            return intervals;
        }
        List<int[]> ans = Arrays.stream(intervals).sorted(Comparator.comparingInt(o -> o[0])).collect(Collectors.toList());
        while (true) {
            if (ans.size() < 2) {
                return convert(ans);
            }
            for (int i = 0; i < ans.size() -1; i ++) {
                int[] interval1 = ans.get(i);
                int[] interval2 = ans.get(i + 1);
                if (interval2[0] <= interval1[1] && interval2[1] > interval1[1]) {
                    ans.remove(i);
                    ans.set(i, new int[] {interval1[0], interval2[1]});
                    break;
                }if (interval2[0] <= interval1[1] && interval2[1] <= interval1[1]) {
                    ans.remove(i + 1);
                    break;
                } else if (interval2[0] == interval1[0] && interval2[1] == interval1[1]) {
                    ans.remove(i);
                    break;
                }
                else if (interval2[0] > interval1[1]) {
                    if (i == ans.size() -2) {
                        return convert(ans);
                    }
                }
            }
        }
    }

    private int[][] convert(List<int[]> ans) {
        int[][] res = new int[ans.size()][];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }


    @Test
    public void test() {
        int[][] interval = {{0,0}, {4, 5}, {5, 6}, {5, 5}, {2, 3}, {5, 7}, {0,0}};
        Arrays.stream(merge(interval)).forEach(e -> System.err.println(Arrays.toString(e)));
    }
}
