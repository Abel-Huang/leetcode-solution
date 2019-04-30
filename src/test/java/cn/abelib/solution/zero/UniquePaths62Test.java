package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 16:16
 */
public class UniquePaths62Test {
    private UniquePaths62 uniquePaths62;

    @Before
    public void init() {
        uniquePaths62 = new UniquePaths62();
    }

    @Test
    public void uniquePaths() {
        int m = 2, n = 3;
        System.out.print(uniquePaths62.uniquePaths(m, n));

    }
}