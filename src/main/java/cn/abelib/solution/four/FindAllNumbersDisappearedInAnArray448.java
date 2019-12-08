package cn.abelib.solution.four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 00:36
 */
public class FindAllNumbersDisappearedInAnArray448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int temp;
        for (int i =  0; i < n; i++) {
            if (nums[i] != nums[nums[i] - 1]) {
                temp = nums[nums[i] -1];
                nums[nums[i] -1] = nums[i];
                nums[i] = temp;
                i --;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i + 1 != nums[i] ) {
                result.add(i + 1);
            }
        }
        return result;
    }

    @Test
    public void findDisappearedNumbersTest() {
//        int[] nums1 = {4,3,2,7,8,2,3,1};
//        System.err.println(findDisappearedNumbers(nums1));

        int[] nums2 = {1, 1};
        System.err.println(findDisappearedNumbers(nums2));

    }
}
