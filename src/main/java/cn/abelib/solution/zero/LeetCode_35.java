package cn.abelib.solution.zero;

/**
 * Created by abel-huang on 2016/7/20.
 * Standard binary search, remember the type.
 */
public class LeetCode_35 {
    public static void main(String args[]) {
        int nums[] = {1, 5, 7, 8};
        System.out.print(searchInsert(nums, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        else {
            int front = 0, end = nums.length - 1, mid = (front - end) / 2 + end;
            while (front <= end) {
                mid = (front - end) / 2 + end;
                if (nums[mid] < target) {
                    front = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            if (nums[mid] > target)
                return mid;
            else
                return mid + 1;
        }
    }
}
