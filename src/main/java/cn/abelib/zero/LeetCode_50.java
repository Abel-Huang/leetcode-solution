package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/25.
 * I will write a detail notes about this type of questions.
 */
public class LeetCode_50 {
    public static void main(String args[]){
        System.out.print(myPow(2.0,5));
    }

    public static double myPow(double x, int n) {
        if(n<0){
            if(n==Integer.MIN_VALUE)
                return 1.0/(myPow(x, Integer.MAX_VALUE)*x);
            else
                return 1.0/myPow(x,-n);
        }
        if(n==0){
            return 1.0;
        }
        double ans=1.0;
        for(;n>0;x*=x,n>>=1){
            if((n&1)>0)
                ans*=x;
        }
        return ans;
    }
}
