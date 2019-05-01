package cn.abelib.solution.nine;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 19:55
 */
public class DIStringMatch942 {
    public int[] diStringMatch(String S) {
        int[] result = new int[S.length() + 1];

        int dCount = 0;
        int iCount = 0;
        for (int i = 0; i < S.length(); i ++) {
            if (S.charAt(i) == 'D') {
                dCount ++;
            } else {
                iCount ++;
            }
        }
        return null;
    }
}
