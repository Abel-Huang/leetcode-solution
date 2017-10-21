package cn.abelib.three;

/**
 * Created by abel-huang on 2016/7/5.
 */
public class LeetCode_344 {
    public static void main(String args[]){
        String s="hello";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        char chars[]=s.toCharArray();
        char temp[]=new char[s.length()];
        String result;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            temp[i]=chars[j];
        }
        result=new String(temp);
        return result;
    }
}
