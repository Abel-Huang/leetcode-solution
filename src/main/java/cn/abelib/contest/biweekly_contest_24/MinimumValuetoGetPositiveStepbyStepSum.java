package cn.abelib.contest.biweekly_contest_24;

/**
 * @Author: abel.huang
 * @Date: 2020-04-18 22:34
 */
public class MinimumValuetoGetPositiveStepbyStepSum {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i< nums.length; i++) {
            if (i == 0){
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            min = Math.min(min, sum);
        }
        if (min >= 1) {
            return 1;
        }
        return 1 - min;
    }
}
