package cn.abelib.solution.two;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 20:28
 */
public class NimGame292 {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }
        if (n % 4 == 0) {
            return false;
        }
        return true;
    }
}
