package cn.abelib.solution.three;

/**
 *
 * @author abel-huang
 * @date 2016/8/3
 * Bit
 */
public class PowerOfFour342 {
    public static void main(String[] args) {
        int a = 64;
        System.out.print(isPowerOfFour(a));
    }

    public static boolean isPowerOfFour(int num) {
        if ((num & (num - 1)) != 0) {
            return false;
        }
        while (num > 1) {
            num = num >>> 2;
        }
        return num == 1;
    }
}
