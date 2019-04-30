package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 16:38
 */
public class AddBinary67Test {
    private AddBinary67 addBinary67;
    @Before
    public void init() {
        addBinary67 = new AddBinary67();
    }

    @Test
    public void addBinary() {
        String a = "1010", b = "1011";
        System.out.println(addBinary67.addBinary(a, b));
    }
}