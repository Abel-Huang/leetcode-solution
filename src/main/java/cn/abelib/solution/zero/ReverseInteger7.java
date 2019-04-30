package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/31
 * Integer in Java, the range is -2147483648~2147483648
 * I write this program following a sample on Internet, if the number is over range
 * of Integer, return 0, like 21th line.
 */
public class ReverseInteger7 {
    public int reverse(int x) {
        int result = 0;
        int temp;
        while (x != 0) {
            temp = x % 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + temp;
            x /= 10;
        }
        return result;
    }

    public static int reverseByString(int x) {
        int y=Math.abs(x),finalNum;
        String str=y+"",result;
        char[] nums=new char[str.length()];
        for(int i=0;i<nums.length;i++){
            nums[i]=str.charAt(nums.length-i-1);
        }
        result=new String(nums);
        finalNum=Integer.parseInt(result);
        if(x>=0) {
            return finalNum;
        } else {
            return -1*finalNum;
        }
    }
}


