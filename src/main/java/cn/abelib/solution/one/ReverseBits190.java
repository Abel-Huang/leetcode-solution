package cn.abelib.solution.one;

/**
 * @author abel.huang
 * @date 2019/4/28 15:35
 */
public class ReverseBits190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binaryStr = Integer.toUnsignedString(n, 2);
        return Integer.parseUnsignedInt(new StringBuilder(binaryStr).reverse().toString());
    }
}
