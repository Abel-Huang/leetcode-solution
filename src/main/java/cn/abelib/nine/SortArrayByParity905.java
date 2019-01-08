package cn.abelib.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-04 01:05
 * TAG: 双指针，数组
 */
public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] A) {
        if (A.length < 2) {
            return A;
        }
        int head = 0;
        int tail = A.length - 1;
        while (true) {
            while (A[head] % 2 == 0 && head < tail) {
                head++;
            }
            while (A[tail] % 2 == 1 && head < tail) {
                tail--;
            }
            if (head >= tail) {
                break;
            }
            int temp = A[head];
            A[head] = A[tail];
            A[tail] = temp;
        }
        return A;
    }

    @Test
    public void sortArrayByParityTest() {
        int[] A = {0, 2};
        Arrays.stream(sortArrayByParity(A)).forEach(System.out::println);
    }
}
