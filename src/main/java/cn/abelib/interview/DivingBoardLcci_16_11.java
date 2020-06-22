package cn.abelib.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-06-20 01:06
 * todo
 */
public class DivingBoardLcci_16_11 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k < 1) {
            return new int[0];
        }
        List<Integer> results = new ArrayList<>();
        int min = shorter * k;
        int max = longer * k;
        for (int i = min; i <= max; i ++) {
            if (match(i, shorter, longer, k)) {
                results.add(i);
            }
        }
        return results.stream().mapToInt(Integer::valueOf).toArray();
    }

    private boolean match(int num, int shorter, int longer, int k) {
        for (int i = 0; i <= k; i ++) {
            int j = k - i;
            if (num == i * shorter + j * longer) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(divingBoard(1, 3, 4)) );
    }
}
