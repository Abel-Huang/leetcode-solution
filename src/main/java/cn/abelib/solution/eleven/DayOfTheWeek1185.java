package cn.abelib.solution.eleven;

import org.junit.Test;

import java.time.LocalDate;

/**
 * @Author: abel.huang
 * @Date: 2019-09-14 23:21
 */
public class DayOfTheWeek1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        LocalDate date = LocalDate.of(year, month, day);
        int idx = date.getDayOfWeek().getValue();
        return weekDays[idx];
    }

    @Test
    public void dayOfTheWeekTest() {
        int day = 31;
        int month = 8;
        int year = 2019;
        System.err.println(dayOfTheWeek(day, month, year));
    }
}
