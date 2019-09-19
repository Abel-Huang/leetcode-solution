package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-09-16 21:43
 */
public class UniqueEmailAddresses929 {
    public int numUniqueEmails(String[] emails) {
        if (emails.length < 1) {
            return 0;
        }
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            String[] sub1 = email.split("@");
            if (sub1.length < 2 || sub1[0].length() < 1) {
                continue;
            }
            if (!sub1[0].contains("+")) {
                unique.add(sub1[0].replaceAll("\\.", "") + "@" + sub1[1]);
            }
            String[] sub2 = email.split("\\+");
            if (sub2.length < 2 || sub2[0].length() < 1) {
                continue;
            }
            unique.add(sub2[0].replaceAll("\\.", "") + "@" + sub1[1]);
        }
        return unique.size();
    }


    @Test
    public void numUniqueEmailsTest() {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.err.println(numUniqueEmails(emails));
        String[] emails2 ={"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.err.println(numUniqueEmails(emails2));
    }
}
