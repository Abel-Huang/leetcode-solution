package cn.abelib.zero;

import java.util.Stack;

/**
 * Created by huangjianjin on 2016/7/11.
 * goal: how to use stack in Java
 * notes:lastElement means pop rather firstElement
 */
public class LeetCode_20 {
    public static void main(String args[]){
        String s="([])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        boolean isVal;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.size()!=0){
                char temp=stack.lastElement();
                if((temp=='('&&s.charAt(i)==')')||(temp=='['&&s.charAt(i)==']')||(temp=='{'&&s.charAt(i)=='}')){
                    stack.pop();
                }
                else
                    stack.add(new Character(s.charAt(i)));
            }
            else{
                stack.add(new Character(s.charAt(i)));
            }
        }
        if(stack.size()==0)
            isVal=true;
        else
            isVal=false;
        return isVal;
    }
}
