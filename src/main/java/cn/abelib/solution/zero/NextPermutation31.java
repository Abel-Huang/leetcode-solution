package cn.abelib.solution.zero;

import java.util.Arrays;

/**
 *
 * @author abel-huang
 * @date 2016/7/21
 */
public class NextPermutation31 {

    public void nextPermutation(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int index = nums.length - 1;
        while (nums[index] <= nums[index - 1]) {
            index--;
            if (index == 0) {
                break;
            }
        }
        if (index == 0) {
            Arrays.sort(nums);
            return;
        }
        int secondNum = Integer.MAX_VALUE;
        int secondIndex = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= index - 1; i--) {
            if (nums[i] > nums[index - 1]) {
                if (nums[i] < secondNum) {
                    secondNum = nums[i];
                    secondIndex = i;
                }
            }
        }
        int[] array = new int[2];
        array[0] = nums[index - 1];
        array[1] = nums[secondIndex];
        swap(array);
        nums[index - 1] = array[0];
        nums[secondIndex] = array[1];
        Arrays.sort(nums, index, nums.length);
    }

    private void swap(int[] swapArray) {
        int temp = swapArray[0];
        swapArray[0] = swapArray[1];
        swapArray[1] = temp;
    }

}
