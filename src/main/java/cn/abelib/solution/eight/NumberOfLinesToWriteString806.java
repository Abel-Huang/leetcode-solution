package cn.abelib.solution.eight;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 23:15
 * 注意可能存在一行写不下的情况，需要另起一行
 */
public class NumberOfLinesToWriteString806 {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 0;
        int totalWidth = 0;
        for (int i = 0; i < S.length(); i++) {
            totalWidth += widths[S.charAt(i) - 'a'];
            if (totalWidth > 100) {
                lines ++;
                totalWidth = widths[S.charAt(i) - 'a'];
            }
        }
        if (totalWidth > 0) {
            lines ++;
        }

        return new int[]{lines, totalWidth};
    }
}
