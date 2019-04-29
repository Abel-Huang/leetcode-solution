package cn.abelib.solution.two;

/**
 * Created by  abel-huang on 2016/8/17.
 * ince each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 */
public class LeetCode_278 {
    public static void main(String args[]) {
        int nums[] = {1, 3, 5, 6};
        //  System.out.print(searchInsert(nums,5));
    }

    public static int firstBadVersion(int n) {
        int front = 1;
        int end = n;
        int mid = (end - front) / 2 + front;
        while (front <= end) {
            mid = (end - front) / 2 + front;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                front = mid + 1;
            }
        }
        return front;
    }

    static boolean isBadVersion(int version) {
        return true;
    }
}
