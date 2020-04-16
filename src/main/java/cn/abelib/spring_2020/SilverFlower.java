package cn.abelib.spring_2020;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: abel.huang
 * @Date: 2020-03-19 20:12
 */
public class SilverFlower {
    public static int maxScore(int[] n, int[] m, int len) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(3, Comparator.reverseOrder());
        for (int i : n) {

            queue.add(i);
            if (queue.size() == 4) {
                queue.poll();
            }

        }
        int max1 = 0;
        while (!queue.isEmpty()) {
            max1 += queue.poll();
        }
        for (int i : m) {
            queue.add(i);
            if (queue.size() == 4) {
                queue.poll();
            }
        }
        int max2 = 0;
        while (!queue.isEmpty()) {
            max2 += queue.poll();
        }
        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        int[] n = {12, 13, 14, 12};
        int[] m = {12, 13, 14, 12};
        System.err.println(maxScore(n, m, 4));
    }
}
