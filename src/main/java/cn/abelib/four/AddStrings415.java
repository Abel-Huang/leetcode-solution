package cn.abelib.four;


/**
 * @Author: abel.huang
 * @Date: 2019-04-28 00:25
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        if (num1.length() < 1) {
            return num2;
        }
        if (num2.length() < 1) {
            return num1;
        }
        String max = num1.length() > num2.length() ? num1 : num2;
        String min = num1.length() > num2.length() ? num2 : num1;
        max = new StringBuilder(max).reverse().toString();
        min = new StringBuilder(min).reverse().toString();
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < max.length(); i ++){
            if (i < min.length()) {
                int result = min.charAt(i) + max.charAt(i) + flag - 96;
                flag = result / 10;
                result = result % 10;
                sb.append(result);
            } else {
                int result = (int)max.charAt(i) + flag - 48;
                flag = result / 10;
                result = result % 10;
                sb.append(result);
            }
        }
        if (flag > 0) {
            sb.append(flag);
        }
        return sb.reverse().toString();
    }
}
