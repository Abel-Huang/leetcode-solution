package cn.abelib.solution.zero;

/**
 * @Author: abel.huang
 * @Date: 2019-02-12 21:29
 */
public class Sqrtx69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        if (x < 4) {
            return 1;
        }
        if (x < 9) {
            return 2;
        }
       if (x >= 2147395600) {
           return 46340;
       }
        int left = 1;
        int right = 46340;
        int mid = 0;
        while (left < right) {
            mid = (right + left) / 2;
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return mid;
            }
            else if (mid * mid > x) {
                right = mid;
            }
            else if ((mid + 1) * (mid + 1) <= x) {
                left = mid;
            }

        }
        return mid;
    }

    public int mySqrt2(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int) a;

    }
}
