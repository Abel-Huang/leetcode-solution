package cn.abelib.point;

/**
 * @Author: abel.huang
 * @Date: 2020-07-22 21:41
 */
public class MinArray11 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 1) {
            return numbers[0];
        }
        if (len < 1) {
            return 0;
        }
        for (int i = 0; i < len - 1;  i ++) {
            if (numbers[i] > numbers[i + 1]){
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }
}
