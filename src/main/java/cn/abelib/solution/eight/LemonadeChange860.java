package cn.abelib.solution.eight;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 15:27
 */
public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five += 1;
            }
            if (bill == 10) {
                if (five < 1) {
                    return false;
                } else {
                    five --;
                    ten ++;
                }
            }
            if (bill == 20) {
                if (ten >= 1 && five >= 1) {
                    ten --;
                    five--;
                    continue;
                }
                if (five >= 3) {
                    five -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    @Test
    public void lemonadeChangeTest() {
        int[] bills = {5,5,5,10,20};
        System.err.println(lemonadeChange(bills));
        int[] bills1 = {5,5,10};
        System.err.println(lemonadeChange(bills1));
        int[] bills2 = {10,10};
        System.err.println(lemonadeChange(bills2));
    }
}
