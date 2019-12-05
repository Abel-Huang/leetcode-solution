package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 23:14
 */
public class StudentAttendanceRecordI551 {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        if (s.indexOf("A") != s.lastIndexOf("A")) {
            return false;
        }
        return true;
    }

    @Test
    public void checkRecordTest () {
        String s1 = "APALLP";
        System.err.println(checkRecord(s1));

        String s2 = "PPALLL";
        System.err.println(checkRecord(s2));
    }
}
