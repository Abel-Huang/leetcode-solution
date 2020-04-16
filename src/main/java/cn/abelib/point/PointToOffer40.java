package cn.abelib.point;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2020-04-13 23:25
 */
public class PointToOffer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        if (k < 1) {
            return ans;
        }
        int len = arr.length;
        if (k == len) {
            return arr;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
            if (queue.size() == k) {
                i = Math.min(queue.poll(), i) ;
            }
            queue.add(i);
        }
        for (int i = 0; i < k; i ++) {
            ans[i] = queue.poll();
        }
        return ans;
    }

    @Test
    public void test1() {
        int[] arr = {0,1,2,1};
        int k = 1;
        System.err.println(Arrays.toString(getLeastNumbers(arr, k)));
    }

    @Test
    public void test2() {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(0);
        queue.add(2);
        queue.add(1);
        while (!queue.isEmpty()) {
            System.err.println(queue.poll());
        }

    }
}
