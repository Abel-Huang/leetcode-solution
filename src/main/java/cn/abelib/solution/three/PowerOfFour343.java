package cn.abelib.solution.three;

/**
 *
 * @author abel-huang
 * @date 2016/8/3
 */
public class PowerOfFour343 {
    public static void main(String args[]) {
        int a = 11;
        System.out.print(integerBreak(a));
    }

    public static int integerBreak(int n) {
        if (n < 2 || n > 58) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n % 3 == 0) {
            return (int) Math.pow(3, n / 3);
        } else if (n % 3 == 1) {
            return (int) Math.pow(3, n / 3 - 1) * 4;
        } else {
            return (int) Math.pow(3, n / 3) * 2;
        }
    }
}
