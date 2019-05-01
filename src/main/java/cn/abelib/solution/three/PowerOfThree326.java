package cn.abelib.solution.three;

/**
 *
 * @author abel-huang
 * @date 2016/7/11
 */
public class PowerOfThree326 {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n = n / 3;
            }
        }
        return n == 1;
    }
}
