package cn.abelib.ten;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 23:47
 * todo 位运算
 *
 */
public class ComplementOfBase10Integer1009 {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        if ((N&N+1) == 0) {
            return 0;
        }
        if ((N&N-1) == 0) {
            return N-1;
        }
        String binStr = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binStr.length(); i++) {
            sb.append(binStr.charAt(i) == '1'? '0' :'1');
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
