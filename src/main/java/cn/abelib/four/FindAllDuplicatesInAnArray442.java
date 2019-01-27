package cn.abelib.four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-01-08 14:37
 * 计数排序来处理
 *  todo
 */
public class FindAllDuplicatesInAnArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int temp = nums[i];
                if(temp == nums[temp - 1]) {
                    list.add(temp);
                } else {
                    nums[i] = nums[temp - 1];
                    nums[temp - 1] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        return list;
    }

    @Test
    public void findDuplicatesTest() {
        int[] nums = {5,4,6,7,9,3,10,9,5,6};
        System.out.println(findDuplicates(nums));
    }
}
