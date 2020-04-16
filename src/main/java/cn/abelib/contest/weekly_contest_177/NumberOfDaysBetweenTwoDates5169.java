package cn.abelib.contest.weekly_contest_177;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @Author: abel.huang
 * @Date: 2020-02-24 01:59
 */
public class NumberOfDaysBetweenTwoDates5169 {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs((int) LocalDate.parse(date1).until(LocalDate.parse(date2), ChronoUnit.DAYS));
    }

    @Test
    public void test() {
        System.err.println(daysBetweenDates("2019-06-29", "2019-06-30"));
        System.err.println(daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}
