package cn.abelib.solution.six;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 00:45
 *
 *  todo 位运算
 */
public class BinaryNumberWithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        String binStr = Integer.toBinaryString(n);
        if (binStr.length() < 2) {
            return true;
        }
        for (int i = 1; i < binStr.length(); i++) {
            if (binStr.charAt(i) == binStr.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
