package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-03-29 17:42
 */
public class AsFarfromLandasPossible1162 {
    public int maxDistance(int[][] grid) {
        int len = grid.length;
        List<List<Integer>> lands = new ArrayList<>(len);
        List<List<Integer>> oceans = new ArrayList<>(len);

        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < len; j ++) {
                List<Integer> point = new ArrayList<>(2);
                point.add(i);
                point.add(j);
                if (grid[i][j] == 0) {
                    oceans.add(point);
                } else {
                    lands.add(point);
                }
            }
        }

        if (lands.isEmpty() || oceans.isEmpty()) {
            return -1;
        }
        int max = 0;
        for (List<Integer> pointO : oceans) {
            int min = Integer.MAX_VALUE;
            for (List<Integer> pointL : lands) {
                min = Math.min(min, Math.abs(pointL.get(0) - pointO.get(0)) + Math.abs(pointL.get(1) - pointO.get(1))) ;
            }
            max = Math.max(max, min);
        }

        return max;
    }

    @Test
    public void maxDistanceTest() {
        int[][] grid1 = {{1,0,1},{0,0,0},{1,0,1}};
        System.err.println(maxDistance(grid1));

        int[][] grid2 = {{1,0,0},{0,0,0},{0,0,0}};
        System.err.println(maxDistance(grid2));
    }
}
