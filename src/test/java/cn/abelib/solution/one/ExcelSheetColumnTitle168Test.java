package cn.abelib.solution.one;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/28 16:31
 */
public class ExcelSheetColumnTitle168Test {
    ExcelSheetColumnTitle168 title168;

    @Before
    public void init() {
        title168 = new ExcelSheetColumnTitle168();
    }

    @Test
    public void convertToTitle() {
        System.err.println(title168.convertToTitle(26));
//        System.err.println(title168.convertToTitle(27));
//        System.err.println(title168.convertToTitle(28));
//        System.err.println(title168.convertToTitle(701));
    }
}