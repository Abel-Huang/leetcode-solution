package cn.abelib.contest.biweekly_contest_19;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-08 22:46
 */
public class AngleClock {
    double hourNum = 30;
    double minutesNum = 6;
    public double angleClock(int hour, int minutes) {
        hour = hour % 12;
        if (hour == 0 && minutes == 0) {
            return 0;
        }
        double hourAns = minutes / 60.0 * hourNum + hour * hourNum;
        double minutesAns = minutes * minutesNum;
        double min = Math.min(Math.abs(hourAns - minutesAns), Math.abs((hourAns - minutesAns + 360)));
        min = Math.min(min, Math.abs((minutesAns - hourAns + 360)));
        min = Math.min(min, Math.abs((360 - minutesAns - hourAns + 360)));
        return min;
    }

    @Test
    public void angleClockTest() {
        System.err.println(angleClock(12, 30));
        System.err.println(angleClock(3, 30));
        System.err.println(angleClock(3, 15));
        System.err.println(angleClock(4, 50));
        System.err.println(angleClock(12, 0));
        System.err.println(angleClock(1, 57));
        System.err.println(angleClock(6, 5));
    }
}
