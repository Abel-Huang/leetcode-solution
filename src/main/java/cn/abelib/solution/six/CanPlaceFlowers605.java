package cn.abelib.solution.six;

/**
 * @Author: abel.huang
 * @Date: 2021-01-05 22:50
 */
public class CanPlaceFlowers605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n < 1) {
            return true;
        }

        int len = flowerbed.length;
        for (int i = 0; i < len; i ++) {
            if (flowerbed[i] == 0) {
                if (i == len - 1 || flowerbed[i + 1] == 0) {
                    n --;
                    i ++;
                }
            } else if (flowerbed[i] == 1) {
                i ++;
            }
            if (n < 1) {
                return true;
            }
        }
        return false;
    }
}
