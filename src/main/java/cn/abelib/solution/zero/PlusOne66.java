package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/18.
 *
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        if (digits.length == 0) {
            list.add(1);
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                int hehe = (digits[i] + 1) % 10;
                list.add(hehe);
                temp = (digits[i] + 1) / 10;
            } else {
                int hehe = (digits[i] + temp) % 10;
                list.add(hehe);
                temp = (digits[i] + temp) / 10;
            }
        }
        if (temp != 0) {
            list.add(temp);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }
}
