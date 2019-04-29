package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-11 01:15
 * TAG: 步长设为 2, 奇偶数位互换
 */
public class SortArrayByParity922 {
    public int[] sortArrayByParityII(int[] A) {
        if (A.length < 2) {
            return A;
        }
        int next = 1;
        int temp = 0;
        for (int i = 0; i < A.length; i += 2){
            if (A[i] % 2 != 0) {
                while (true) {
                    if (A[next] % 2 == 0) {
                        temp = A[i];
                        A[i] = A[next];
                        A[next] = temp;
                        next += 2;
                        break;
                    }
                    if (next == A.length - 1) {
                        break;
                    }
                    next += 2;
                }
            }
        }
        return A;
    }

    @Test
    public void sortArrayByParityIITest() {
        int[] A = {1};
       Arrays.stream(sortArrayByParityII(A)).forEach(System.out::println);
    }
}
