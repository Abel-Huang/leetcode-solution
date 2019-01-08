package cn.abelib.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/18.
 * We should consider about the length of array when we add one,
 * because there maybe carry
 */
public class LeetCode_66 {
    public static void main(String args[]) {
        int test[] = {1, 2}, result[] = plusOne(test);
        for (int i = 0; i < result.length; i++)
            System.out.print(" " + result[i]);
    }

    public static int[] plusOne(int[] digits) {
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        if (digits.length == 0)
            list.add(new Integer(1));
        else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == digits.length - 1) {
                    int hehe = (digits[i] + 1) % 10;
                    list.add(new Integer(hehe));
                    temp = (digits[i] + 1) / 10;
                } else {
                    int hehe = (digits[i] + temp) % 10;
                    list.add(new Integer(hehe));
                    temp = (digits[i] + temp) / 10;
                }
            }
            if (temp != 0)
                list.add(new Integer(temp));
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }
}
