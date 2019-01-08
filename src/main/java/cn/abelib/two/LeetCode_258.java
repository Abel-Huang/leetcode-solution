package cn.abelib.two;

/**
 * Created by  abel-huang on 2016/7/11.
 * in the range of integer, the first time add couldn't bigger
 * than 90.
 */
public class LeetCode_258 {
    public static void main(String args[]) {
        int nums = 199;
        System.out.print(addDigits(nums));
    }

    public static int addDigits(int num) {
        String s = num + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        String temp = sum + "";
        sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += Integer.parseInt(temp.charAt(i) + "");
        }
        String result = sum + "";
        sum = 0;
        for (int i = 0; i < result.length(); i++) {
            sum += Integer.parseInt(result.charAt(i) + "");
        }
        return sum;
    }
}
