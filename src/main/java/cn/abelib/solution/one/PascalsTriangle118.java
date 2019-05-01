package cn.abelib.solution.one;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abel-huang
 * @date 2016/7/19
 */
public class PascalsTriangle118 {
    public static void main(String args[]) {
        int a = 5;
        System.out.println(generate(a).toString());
    }

    public static List<List<Integer>> generate(int numRows) {
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
}
