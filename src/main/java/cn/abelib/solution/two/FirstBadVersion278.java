package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/8/17
 */
public class FirstBadVersion278 {
    public static void main(String args[]) {
        int[] nums = {1, 3, 5, 6};
        //  System.out.print(searchInsert(nums,5));
    }

    public int firstBadVersion(int n) {
        int front = 1;
        int end = n;
        while (front <= end) {
            int mid = (end - front) / 2 + front;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                front = mid + 1;
            }
        }
        return front;
    }

    boolean isBadVersion(int version) {
        return true;
    }
}
