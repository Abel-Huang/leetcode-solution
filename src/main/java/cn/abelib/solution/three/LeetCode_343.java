package cn.abelib.solution.three;

/**
 * Created by abel-huang on 2016/8/3.
 * I find that when the number is bigger than 3, the more 3's number
 * included, the bigger of the product.
 */
public class LeetCode_343 {
    public static void main(String args[]) {
        int a = 11;
        System.out.print(integerBreak(a));
    }

    public static int integerBreak(int n) {
        if (n < 2 || n > 58)
            return 0;
        else if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        else {
            if (n % 3 == 0)
                return (int) Math.pow(3, n / 3);
            else if (n % 3 == 1)
                return (int) Math.pow(3, n / 3 - 1) * 4;
            else
                return (int) Math.pow(3, n / 3) * 2;
        }
    }
}
