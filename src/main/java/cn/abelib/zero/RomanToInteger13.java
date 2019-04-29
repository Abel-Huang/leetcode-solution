package cn.abelib.zero;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abel.huang
 * @date 2019/4/28 15:20
 */
public class RomanToInteger13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(8);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        if(s.length() < 1) {
            return 0;
        }
        if(s.length() == 1) {
            return map.get(s.charAt(0));
        }
        for(int i = 0; i < s.length() - 1; i ++ ) {
            int now = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            if(now < next){
                result -= now;
            } else {
                result += now;
            }
            if(i == s.length() - 2) {
                result += next;
            }
        }
        return result;
    }
}
