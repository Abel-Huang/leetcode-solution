package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/7/27.
 */
public class ProductOfArrayExceptSelf238 {
    public static void main(String args[]) {
        //System.out.println(removeNthFromEnd(head,1).val);
    }

    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            left[i] = 1;
            right[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left[i] = 1;
            } else {
                left[i] = nums[i - 1] * left[i - 1];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                right[i] = 1;
            } else {
                right[i] *= nums[i + 1] * right[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = right[i] * left[i];
        }
        return nums;
    }
}
