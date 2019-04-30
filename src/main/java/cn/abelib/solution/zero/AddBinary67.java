package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/22
 * Binary and string.
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            return a + b;
        }
        int temp = 0;
        int lengthMin = Math.min(a.length(), b.length());
        int lengthMax = Math.max(a.length(), b.length());
        String as = new StringBuffer(a).reverse().toString();
        String bs = new StringBuffer(b).reverse().toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lengthMax; i++) {
            if (i < lengthMin) {
                sb.append((as.charAt(i) + bs.charAt(i) - 96 + temp) % 2);
                if (as.charAt(i) + bs.charAt(i) + temp - 96 > 1) {
                    temp = 1;
                } else {
                    temp = 0;
                }
            } else if (i >= as.length() && i < bs.length()) {
                sb.append((bs.charAt(i) + temp - 48) % 2);
                if (bs.charAt(i) + temp - 48 > 1) {
                    temp = 1;
                } else {
                    temp = 0;
                }
            } else if (i >= bs.length() && i < as.length()) {
                sb.append((as.charAt(i) + temp - 48) % 2);
                if (as.charAt(i) + temp - 48 > 1) {
                    temp = 1;
                } else {
                    temp = 0;
                }
            }
        }
        if (temp != 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
