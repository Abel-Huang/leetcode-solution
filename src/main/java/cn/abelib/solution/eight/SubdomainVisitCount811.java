package cn.abelib.solution.eight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 00:32
 */
public class SubdomainVisitCount811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] subDomain = domain.split(" ");
            if (subDomain.length < 2) {
                continue;
            }
            int cnt =Integer.parseInt(subDomain[0]);
            String[] sub = subDomain[1].split("\\.");
            if (sub.length < 2) {
                continue;
            }
            if (sub.length == 2) {
                if (!map.containsKey(subDomain[1])) {
                    map.put(subDomain[1], cnt);
                } else {
                    map.put(subDomain[1], cnt + map.get(subDomain[1]));
                }
                String d2 = sub[1];
                if (!map.containsKey(d2)) {
                    map.put(d2, cnt);
                } else {
                    map.put(d2, cnt + map.get(d2));
                }
            }
            if (sub.length == 3) {
                if (!map.containsKey(subDomain[1])) {
                    map.put(subDomain[1], cnt);
                } else {
                    map.put(subDomain[1], cnt + map.get(subDomain[1]));
                }
                String d2 = sub[1] + "." + sub[2];
                if (!map.containsKey(d2)) {
                    map.put(d2, cnt);
                } else {
                    map.put(d2, cnt + map.get(d2));
                }
                String d3 = sub[2];
                if (!map.containsKey(d3)) {
                    map.put(d3, cnt);
                } else {
                    map.put(d3, cnt + map.get(d3));
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    @Test
    public void subdomainVisitsTest() {
        String[] cpdomains1 = {"9001 discuss.leetcode.com"};
        System.err.println(subdomainVisits(cpdomains1));
        String[] cpdomains2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.err.println(subdomainVisits(cpdomains2));
    }
}
