package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/7/11
 */
public class AddDigits258 {
    public static void main(String args[]) {
        int nums = 199;
        System.out.print(addDigits(nums));
    }

    public static int addDigits(int num) {
        String s;
        int sum = num;

        for (int k = 0; k < 3; k++) {
            s = sum + "";
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
        }
        return sum;
    }

    public static int addDigits2(int num) {
       if (num  < 10) {
           return num;
       }
       int result = 0;
       while (true) {
           while (true) {
               if (num  < 10) {
                   result += num;
                   break;
               }
               result += num % 10;
               num = num / 10;
           }
           if (result < 10) {
               return result;
           }
           num = result;
           result = 0;
       }
    }
}
