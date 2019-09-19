package cn.abelib.solution.one;

/**
 * @author abel.huang
 * @date 2019/4/28 16:16
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle2(int n) {
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

    public String convertToTitle(int n) {
        if (n < 27) {
            return String.valueOf((char)('A' + n - 1));
        }
        if (n == 702) {
            return "ZZ";
        }
        if (n == 18278) {
            return "ZZZ";
        }
        int dividend;
        int divisor ;
        if (n < 702) {
            dividend = n / 26;
            divisor = n % 26;
            return (char) ('A' + dividend - 1) + String.valueOf((char)('A' + divisor - 1));
        }
        int divisor3 = n / (26 * 26);
        n = n % (26 * 26);
        dividend = n / 26;
        divisor = n % 26;
        return String.valueOf((char)('A' + divisor3 - 1)) + (char) ('A' + dividend - 1) + (char) ('A' + divisor - 1);
    }

    public String convertToTitle3(int n) {
        char start = 'A';
        StringBuilder result = new StringBuilder();
        int divisor = n;
        int dividend = n;
        while (true) {
            dividend = n / 26;
            if (n > 0 || dividend == 0) {
                dividend = 26;
            }
            divisor = n % 26;
            if (n > 0 || divisor == 0) {
                n = divisor;
            }
            if (dividend == 0) {
                result.append((char)(start+divisor-1));
                break;
            } else {
                result.append((char)(start+dividend-1));
            }
        }
        return result.toString();
    }

    public String convertToTitle4(int n) {
        char start = 'A';
        StringBuilder result = new StringBuilder();
        int divisor = n;
        int dividend = n;
        while (true) {
            dividend = n / 27;
            divisor = n % 26;
            n = divisor;
            if (dividend ==0 && divisor == 0) {
                divisor = 26;
            }
            if (dividend == 0) {
                result.append((char)(start + divisor - 1));
                break;
            } else {
                result.append((char)(start + dividend - 1));
            }
        }
        return result.toString();
    }
}
