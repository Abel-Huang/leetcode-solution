package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/6
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int tag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    tag = 1;
                    break;
                }
            }
            if (tag == 1) {
                break;
            }
        }
        return result;
    }
}
