package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 21:31
 */
public class TwoSumSortedInputArray167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int len = numbers.length;
        if (len < 2) {
            return result;
        }
        for (int i = 0, j = len - 1; i < len && j > i ; ) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
            if (numbers[i] + numbers[j] > target) {
                j --;
            }
            else {
                i ++;
            }
        }

        return result;
    }

    @Test
    public void twoSum(){
        int[] numbers = {0, 0, 3, 4};
        int target = 0;
        System.out.println(twoSum(numbers, target)[0] + " " + twoSum(numbers, target)[1]);
    }
}
