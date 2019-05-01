package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/8/8
 * the expect_number - true_number.
 */
public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.print(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (1 + nums.length) * nums.length /2 - sum;
    }
}
