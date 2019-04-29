package cn.abelib.solution.one;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 02:32
 */
public class RotateArray189 {
    /**
     * wrong answer
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        if (len < 2 || (k % len == 0)) {
            return;
        }
        int temp = 0;
        for (int i = 0; i <len; i ++ ) {
            if (nums[i] != nums[(i + k) % len]) {
                temp = nums[i];
                nums[i] = nums[(i + k) % len];
                nums[(i + k) % len] = temp;
            }
        }
    }

    public void rotate(int[] nums, int k) {
        if(k < 1 || nums.length < 2) {
            return;
        }
        while(true) {
            if (k <= 0) {
                break;
            }
            k--;
            int temp = nums[nums.length - 1];
            for(int i = nums.length - 2; i >= 0 ; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
    }
}
