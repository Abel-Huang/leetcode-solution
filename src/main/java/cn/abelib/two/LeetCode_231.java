package cn.abelib.two;

/**
 * Created by  abel-huang on 2016/7/11.
 * <p>
 * finally I AC this question, use bit
 * manipulation to solve this problem,
 * first time I tans to binary, but it
 * out of the range of integer, like
 * 1024 trans to 10000000000, which is
 * bigger the biggest number in int type.
 * <p>
 * Tag: my jvm may be some little trouble.
 */
public class LeetCode_231 {
    public static void main(String args[]) {
        int n = 144;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        boolean isPowTwo = false;
        if (n <= 0) {
            isPowTwo = false;
        } else {
            if ((n & (n - 1)) == 0)
                isPowTwo = true;
            else
                isPowTwo = false;
        }
        return isPowTwo;
    }
}
