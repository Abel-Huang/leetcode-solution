package cn.abelib.solution.four;

/**
 * @Author: abel.huang
 * @Date: 2019-05-02 19:39
 */
public class NumberComplement476 {
    public int findComplement(int num) {
        int[] nums = new int[1000];
        int index = 0;
        int two = 1;
        int sum = 0;
        while (num > 0) {
            nums[index++] = Math.abs(num % 2 - 1);
            num /= 2;
        }
        for (int i =0; i < index; i ++) {
            sum += nums[i] * two;
            two *= 2;
        }
        return sum;
    }
}
