package cn.abelib.three;

/**
 * Created by abel-huang on 2016/8/3.
 * Bit
 */
public class LeetCode_342 {
    public static void main(String args[]) {
        int a = 64;
        System.out.print(isPowerOfFour(a));
    }

    public static boolean isPowerOfFour(int num) {
        if ((num & (num - 1)) != 0)
            return false;
        while (num > 1) {
            num = num >>> 2;
        }
        if (num == 1)
            return true;
        else
            return false;
    }
}
