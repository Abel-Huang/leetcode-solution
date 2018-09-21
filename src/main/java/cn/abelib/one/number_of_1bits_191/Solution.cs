package cn.abelib.one.number_of_1bits_191;

/**
 * Created by abel on 2018/9/21.
 */
public class Solution {
    // Using csharp, because Java has no unsigned
    public int hammingWeight(uint n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int weight = 0;
        while (n > 0){
            if (n % 2 == 1){
                weight++;
            }
            n = n >>> 1;
            if (n == 1){
                weight++;
                break;
            }else if (n == 0){
                break;
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.hammingWeight(256 );
        System.err.println(result);
    }
}