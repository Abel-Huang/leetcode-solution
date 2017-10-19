package cn.abelib.two;

/**
 * Created by  abel-huang on 2016/7/19.
 * Ugly number is a positive numbers whose prime factors only include 2, 3, 5,
 * and we can divide 2,3,5, until it can't be divided, if return 1 the number is
 * a ugly number otherwise not a ugly number.
 */
public class LeetCode_263 {
    public static void main(String args[]){
        int a=7;
       System.out.println(isUgly(a));

    }
    public static boolean isUgly(int num) {
        if(num<=0)
            return false;
        if(num==1||num==2||num==3||num==5)
            return true;
       while(num>=2&&num%2==0)
           num/=2;
        while(num>=3&&num%3==0)
            num/=3;
        while(num>=5&&num%5==0)
            num/=5;
        return num==1;
    }
}
