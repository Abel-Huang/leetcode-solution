package cn.abelib.contest.weekly_contest_184;

/**
 * @Author: abel.huang
 * @Date: 2020-04-12 11:39
 */
public class NumberOfWaysToPaintNX3Grid4 {
    public int numOfWays(int n) {
        if(n == 1) {
            return 12;
        }
        if(n == 2) {
            return 54;
        }
        int first = 12;
        int second = 54;
        int third = 0;
        for(int i = 3; i <=n; i ++) {
            third = (5 * second - 2 * first)  ;
            first = second ;
            second = third ;
        }
        return third;
    }
}
