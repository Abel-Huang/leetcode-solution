package cn.abelib.solution.two;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/7/19
 */
public class SingleNumberIII260 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 2, 5};

        System.out.println(Arrays.toString(singleNumber(a)));
    }

    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        int[] result = new int[2];
        Iterator<Integer> i = set.iterator();

        result[0] = i.next();
        result[1] = i.next();
        return result;
    }
}
