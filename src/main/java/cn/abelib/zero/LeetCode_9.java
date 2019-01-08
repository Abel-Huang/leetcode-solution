package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/15.
 * if a number is negative, it will not be a palindrome
 */
public class LeetCode_9 {
    public static void main(String args[]) {
        int nums = -2147447412;

        System.out.println(isPalindrome(nums));
    }

    public static boolean isPalindrome(int x) {
        String s = Math.abs(x) + "";
        int front = 0, end = s.length() - 1;
        boolean flag = true;
        while (front <= end) {
            if (s.charAt(front) != s.charAt(end)) {
                flag = false;
                break;
            }
            front++;
            end--;
        }
        if (x < 0)
            flag = false;
        return flag;
    }
}
