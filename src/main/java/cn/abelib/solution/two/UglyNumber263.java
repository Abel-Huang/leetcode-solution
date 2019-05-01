package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/7/19
 */
public class UglyNumber263 {
    public static void main(String args[]) {
        int a = 7;
        System.out.println(isUgly(a));

    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1 || num == 2 || num == 3 || num == 5) {
            return true;
        }
        while (num >= 2 && num % 2 == 0) {
            num /= 2;
        }
        while (num >= 3 && num % 3 == 0) {
            num /= 3;
        }
        while (num >= 5 && num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
