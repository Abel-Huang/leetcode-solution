package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-12-09 23:09
 */
public class RestoreIPAddresses93 {
    private List<String> res;

    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        if (s == null || s.equals("") || s.length() > 16 || s.length() < 4) {
            return res;
        }

        return res;
    }

    List<String> restore(String s, int index) {
        return null;
    }

}
