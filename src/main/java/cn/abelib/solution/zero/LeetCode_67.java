package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/22.
 * Binary and string.
 */
public class LeetCode_67 {
    public static void main(String args[]) {
        String a = "0", b = "0";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        if (a == "" || b == "")
            return a + b;
        else {
            int temp = 0;
            int lengthMin = Math.min(a.length(), b.length());
            int lengthMax = Math.max(a.length(), b.length());
            String as = reverse(a);
            String bs = reverse(b);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < lengthMax; i++) {
                if (i < lengthMin) {
                    list.add((as.charAt(i) + bs.charAt(i) - 96 + temp) % 2);
                    if (as.charAt(i) + bs.charAt(i) + temp - 96 > 1)
                        temp = 1;
                    else
                        temp = 0;
                } else if (i >= as.length() && i < bs.length()) {
                    list.add((bs.charAt(i) + temp - 48) % 2);
                    if (bs.charAt(i) + temp - 48 > 1)
                        temp = 1;
                    else
                        temp = 0;
                } else if (i >= bs.length() && i < as.length()) {
                    list.add((as.charAt(i) + temp - 48) % 2);
                    if (as.charAt(i) + temp - 48 > 1)
                        temp = 1;
                    else
                        temp = 0;
                }
            }
            if (temp != 0)
                list.add(1);
            String result = "";
            for (int i = list.size() - 1; i >= 0; i--) {
                result = result + list.get(i);
            }
            return result;
        }
    }

    public static String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
