package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-13 23:18
 */
public class NumberOfProvinces547 {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        if (n == 1) {
            return 1;
        }
        int count = 0;
        int[] set = new int[n];
        for (int i = 0; i < n; i ++) {
           if (set[i] == 0) {
               dfs(isConnected, i, set);
               count ++;
           }
        }
        return count;
    }

    private void dfs(int[][] isConnected, int n, int[] set) {
        set[n] = 1;
        for (int i = 0; i < isConnected.length; i ++) {
            if (isConnected[n][i] == 1 && set[i] == 0) {
                dfs(isConnected, i, set);
            }
        }
    }

    @Test
    public void findCircleNumTest() {
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};

        System.err.println(findCircleNum(isConnected));
    }
}
