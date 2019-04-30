package cn.abelib.solution.ten;

/**
 * @author abel.huang
 * @date 2019/4/30 9:43
 * SUCCESS
 */
public class PartitionArrayIntoThreePartsWithEqualSum1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        if (A.length == 3) {
            return A[0] == A[1] && A[0] == A[2];
        }
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        int avg = sum / 3;
        if (sum % 3 != 0) {
            return false;
        }
        int temp = 0;
        int count = 0;
        for (int i = 0; i < A.length; i ++) {
            temp += A[i];
            if (temp == avg) {
                count ++;
                temp = 0;
            }
        }
       return count == 3 && temp == 0;
    }
}
