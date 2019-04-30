package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 11:00
 */
public class AddTwoNumbers2Test {
    AddTwoNumbers2 addTwoNumbers2;

    @Before
    public void init() {
        addTwoNumbers2 = new AddTwoNumbers2();
    }

    @Test
    public void addTwoNumbers() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        System.out.print(addTwoNumbers2.addTwoNumbers(null, null));
    }
}