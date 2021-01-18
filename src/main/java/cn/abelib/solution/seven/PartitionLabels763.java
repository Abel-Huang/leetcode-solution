package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2021-01-06 22:06
 */
public class PartitionLabels763 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();

        int len = S.length();
        if (len < 2) {
            ans.add(1);
            return ans;
        }
        Set<Character> set = new HashSet<>();
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i < len; i ++) {
            char c = S.charAt(i);
            if (set.contains(c)) {
                continue;
            }
            set.add(c);
            for (int j = len -1; j >= i; j --) {
                if (c == S.charAt(j) || j == i) {
                    intervals.add(new int[]{i, j});
                    break;
                }
            }
        }

        Collections.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int[] prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i ++) {
            int[] interval = intervals.get(i);

            if (prev[1] + 1 == interval[0]) {
                ans.add(prev[1] - prev[0] + 1);
                prev = interval;
            }else {
                prev[0] = Math.min(prev[0], interval[0]);
                prev[1] = Math.max(prev[1], interval[1]);
            }
        }
        ans.add(prev[1] - prev[0] + 1);
        return ans;
    }

    @Test
    public void partitionLabelsTest() {
        System.err.println(partitionLabels("adfefgea"));
    }

}
