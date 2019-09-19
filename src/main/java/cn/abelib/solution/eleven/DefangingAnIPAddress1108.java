package cn.abelib.solution.eleven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 23:32
 */
public class DefangingAnIPAddress1108 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    @Test
    public void defangIPaddrTest() {
        String address = "255.100.50.0";
        System.err.println(defangIPaddr(address));
    }
}
