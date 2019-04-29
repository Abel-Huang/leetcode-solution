package cn.abelib.solution.three;

/**
 * @Author: abel.huang
 * @Date: 2019-03-01 00:25
 */
public class CountingBits338 {
    public int[] countBits(int num) {
        int[] nums = new int[num + 1];
        for(int i = 0; i <= num; i ++) {
            nums[i] = numberOf1(i);
        }
        return nums;
    }

    private int numberOf1(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                cnt ++;
            }
            n = n >> 1;
        }
        return cnt;
    }
}
