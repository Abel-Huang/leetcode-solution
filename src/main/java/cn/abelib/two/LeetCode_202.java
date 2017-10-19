package cn.abelib.two;

import java.util.HashMap;

/**
 * Created by abel-huang on 2016/7/30.
 * It is a easy question, trans integer to string every loop, count the sum of every character
 * and use hashtabale to save the result, if find the same integer in the hashtable then end the loop.
 */
public class LeetCode_202 {
    public static void main(String args[]){
        int a=7;
        System.out.print(" "+isHappy(a));
    }
    public static boolean isHappy(int n) {
        String s=n+"";
        int sum=n;
        if(n==1)
            return true;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        while(true){
            sum=0;
            for(int i=s.length()-1;i>=0;i--){
                sum+=(s.charAt(i)-48)*(s.charAt(i)-48);
            }
            if (!hashMap.containsKey(new Integer(sum)))
                hashMap.put(new Integer(sum),new Integer(sum));
            else
                break;
            if(sum==1)
                break;
            s=sum+"";
        }
        if(sum==1)
            return true;
        else
            return false;
    }
}
