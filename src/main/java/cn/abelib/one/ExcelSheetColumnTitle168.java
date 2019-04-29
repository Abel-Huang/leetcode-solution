package cn.abelib.one;

/**
 * @author abel.huang
 * @date 2019/4/28 16:16
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        int start =65;
        StringBuilder result = new StringBuilder();
        int divisor = n;
        int dividend = n;
        while (true) {
            dividend = n / 26;
            divisor = n % 26;

            result.append((char)(start+dividend + 24));
            if (n > 26) {
                result.append((char)(start+divisor + 24));
                break;
            }
            n = n % 26;
        }
        return result.toString();
    }
}
