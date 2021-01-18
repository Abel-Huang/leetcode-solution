package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-12-09 23:09
 * todo
 *
 */
public class RestoreIPAddresses93 {
    private List<String> res;

    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        if (s == null || s.equals("") || s.length() > 16 || s.length() < 4) {
            return res;
        }
        List<String> track = new ArrayList<>();
        restore(s, 0, track);
        return res;
    }

    private String toIpAddress(List<String> track) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < track.size(); i ++ ) {
            String str = track.get(i);
            sb.append(str);
            if (i != track.size() - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public void restore(String s, int index, List<String> track) {
        if (track.size() == 4) {
            res.add(toIpAddress(track));
            return;
        }

        for (int i = index; i < s.length(); i ++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length() && j < i + 3; j ++) {
                sb.append(s.charAt(j));
                int now = Integer.parseInt(sb.toString());
                if (now <= 255) {
                    track.add(sb.toString());
                    if (track.size() == 4 && j != s.length() - 1) {
                        sb.delete(0, sb.toString().length());
                        continue;
                    }
                    restore(s, j + 1, track);
                    track.remove(track.size() - 1);
                }
            }
        }
    }

    @Test
    public void restoreIpAddressesTest() {
        System.err.println(restoreIpAddresses("25525511135"));
    }

}
