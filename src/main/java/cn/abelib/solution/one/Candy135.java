package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-05 22:12
 * 贪心算法，分成左右两次遍历
 */
public class Candy135 {

    public int candy(int[] ratings) {
        int len = ratings.length;
        if (len < 2) {
            return len;
        }

        int[] temp = new int[len];
        temp[0] = 1;
        for (int i = 1; i < len; i ++) {
            if (ratings[i] > ratings[i - 1]) {
                temp[i] = temp[i - 1] + 1;
            } else{
                temp[i] = 1;
            }
        }
        int ans = temp[len - 1];
        for (int i = len - 1; i > 0; i --) {
            if (ratings[i - 1] > ratings[i] && temp[i - 1] <= temp[i]) {
                temp[i - 1] = temp[i] + 1;
            }
            ans  += temp[i - 1];
        }
        return ans;
    }

    @Test
    public void candyTest() {
        int[] ratings1 = {1,0,2};
        System.err.println(candy(ratings1));

        int[] ratings2 = {1,2,2};
        System.err.println(candy(ratings2));

        int[] ratings3 = {1};
        System.err.println(candy(ratings3));

        int[] ratings4 = {1, 0, 2, 4, 3};
        System.err.println(candy(ratings4));
    }
}
