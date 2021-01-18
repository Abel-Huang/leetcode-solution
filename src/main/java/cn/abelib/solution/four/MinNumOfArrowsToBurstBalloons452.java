package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: abel.huang
 * @Date: 2021-01-06 21:48
 */
public class MinNumOfArrowsToBurstBalloons452 {

    public int findMinArrowShots(int[][] points) {
        int len = points.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }

        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        int ans = 1;
        int[] prev = points[0];
        for (int i = 1; i < len; i ++) {
            int[] point = points[i];
            // 两者不相连
            if (prev[1] < point[0]) {
                prev = point;
                ans ++;
            }else {
                prev[0] = Math.max(prev[0], point[0]);
            }
        }

        return ans;
    }

    @Test
    public void findMinArrowShotsTest() {
        int[][] point1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.err.println(findMinArrowShots(point1));

        int[][] point2= {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.err.println(findMinArrowShots(point2));
    }
}
