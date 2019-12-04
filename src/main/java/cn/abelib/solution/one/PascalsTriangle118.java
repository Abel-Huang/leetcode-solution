package cn.abelib.solution.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abel-huang
 * @date 2016/7/19
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasTrian = new ArrayList<>();
        if (numRows != 0) {
            for (int i = 0; i < numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j > 0 && j < i) {
                        int trans = (pasTrian.get(i - 1)).get(j - 1) + (pasTrian.get(i - 1)).get(j);
                        temp.add(trans);
                    } else {
                        temp.add(1);
                    }
                }
                pasTrian.add(temp);
            }
        }
        return pasTrian;
    }

    public List<List<Integer>> generateReverse(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
               int result =  helper(i, j, i + 1);
               temp.add(result);
            }
            resultList.add(temp);
        }
        return resultList;
    }

    public int helper(int i, int j, int row) {
        if (i == 0 || j == 0 || row - 1 == j) {
            return 1;
        }
        return helper(i - 1, j - 1, row - 1) + helper(i - 1, j, row - 1);
    }

    @Test
    public void generateTest() {
        int a = 5;
        System.out.println(generateReverse(a));
    }
}
