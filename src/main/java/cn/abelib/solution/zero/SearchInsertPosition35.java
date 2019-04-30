package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/20
 * Standard binary search, remember the type.
 */
public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
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
        return nums[mid] > target ? mid : mid + 1;
    }
}
