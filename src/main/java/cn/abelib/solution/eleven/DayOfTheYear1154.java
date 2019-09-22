package cn.abelib.solution.eleven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 16:30
 */
public class DayOfTheYear1154 {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        boolean run = false;
        if (year % 4 == 0 && year != 1900) {
            run = true;
        }
        int cnt;
        int[] dayOfMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        cnt = dayOfMonth[month - 1] + day;
        if (run && month > 2) {
            return cnt + 1;
        }
        return cnt;
    }

    @Test
    public void dayOfYearTest() {
        String date1 = "2019-01-09";
        System.err.println(dayOfYear(date1));
        String date2 = "2019-02-10";
        System.err.println(dayOfYear(date2));
        String date3 = "2003-03-01";
        System.err.println(dayOfYear(date3));
        String date4 = "2004-03-01";
        System.err.println(dayOfYear(date4));
        String date5 = "2016-02-29";
        System.err.println(dayOfYear(date5));
        String date6 = "1961-12-30";
        System.err.println(dayOfYear(date6));
    }
}
