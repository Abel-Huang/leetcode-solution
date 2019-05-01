package cn.abelib.solution.one;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abel-huang
 * @date 2016/7/20
 * This question is similar with 118th.
 */
public class PascalsTriangleII119 {
    public static void main(String args[]) {
        int a = 3;
        System.out.println(generate(a).toString());
    }

    public static List<Integer> generate(int rowIndex) {
        int haha = rowIndex + 1;
        List<List<Integer>> pasTrian = new ArrayList<>();
        for (int i = 0; i < haha; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j > 0 && j < i) {
                    int trans = ((pasTrian.get(i - 1)).get(j - 1)) + ((pasTrian.get(i - 1)).get(j));
                    temp.add(trans);
                } else {
                    temp.add(1);
                }
            }
            pasTrian.add(temp);
            //temp.clear();
        }
        return pasTrian.get(rowIndex);
    }
}
