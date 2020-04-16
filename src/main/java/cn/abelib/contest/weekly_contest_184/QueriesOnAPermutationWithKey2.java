package cn.abelib.contest.weekly_contest_184;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-04-12 10:48
 */
public class QueriesOnAPermutationWithKey2 {
    public int[] processQueries(int[] queries, int m) {
        int len = queries.length;
        int[] result = new int[len];

        int[] p = new int[m];
        for (int i = 0; i < m; i ++) {
            p[i] = i +1;
        }
        for (int i = 0; i < len; i ++) {
            int idx = queries[i];
            int idx2 = 0;
            for (int j = 0; j < p.length; j ++) {
                if (p[j] == idx) {
                    idx2 = j;
                }
            }
            result[i] = idx2;
            for (int j = idx2; j > 0; j --) {
                p[j] =  p[j-1];
            }
            p[0] = idx;
        }
        return result;
    }

    @Test
    public void test1() {
        int[] queries = {3,1,2,1};
        int m = 5;
        System.err.println(Arrays.toString(processQueries(queries, m)));
    }

    @Test
    public void test2() {
        int[] queries = {4,1,2,2};
        int m = 4;
        System.err.println(Arrays.toString(processQueries(queries, m)));
    }

    @Test
    public void test3() {
        int[] queries = {7,5,5,8,3};
        int m = 8;
        System.err.println(Arrays.toString(processQueries(queries, m)));
    }

}
