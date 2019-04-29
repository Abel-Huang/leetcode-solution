package cn.abelib.solution.seven;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-01-08 15:21
 */
public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isDividingNumber(int num) {
        if (num <= 9) {
            return true;
        }
        int temp = num;
        int remainder = 0;
        while (temp > 1) {
            remainder = temp % 10;
            if (remainder == 0) {
                return false;
            }
            if (num % remainder != 0) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    @Test
    public void selfDividingNumbersTest() {
        int left = 1, right = 22;
        selfDividingNumbers(left, right).stream().forEach(System.out::println);
    }
}
