package cn.abelib.point;


/**
 * @Author: abel.huang
 * @Date: 2020-07-23 21:57
 */
public class PrintNumbers17 {
    public int[] printNumbers(int n) {
        int size = 1;
        while (n > 0) {
            size *= 10;
            n --;
        }
        size --;
        int[] ans = new int[size];
        for (int i = 0; i < size; i ++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
