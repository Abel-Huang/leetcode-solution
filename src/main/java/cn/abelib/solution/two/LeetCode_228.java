package cn.abelib.solution.two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  abel-huang on 2016/7/27.
 * I am so foolish that I confused about ""
 */
public class LeetCode_228 {
    public static void main(String args[]) {
        int haha[] = {-1};
        List<String> string = summaryRanges(haha);
        for (int i = 0; i < string.size(); i++)
            System.out.println(string.get(i));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> strings = new ArrayList<>();
        if (nums.length == 0)
            return strings;
        if (nums.length == 1) {
            strings.add(nums[0] + "");
            return strings;
        }
        int first = nums[0];
        int temp = first;
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i] - 1) {
                if (first == temp)
                    strings.add(first + "");
                else {
                    strings.add(first + "->" + temp);
                }
                first = nums[i];
            }
            if (i == nums.length - 1) {
                if (first == nums[i])
                    strings.add(first + "");
                else
                    strings.add(first + "->" + nums[i]);
            }
            temp = nums[i];
        }
        return strings;
    }
}
