package cn.abelib.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by  abel-huang on 2016/8/3.
 * If is equal, the bulls number add one, else use hashtable save the secret element,
 * and use a list to save guess element, and then find every element of guess in hashmap.
 * And the hashmap also stores the number of save value of element.
 */
public class LeetCode_299 {
    public static void main(String args[]){
        String Secret="1123";
        String Guess="0111";
        System.out.print(getHint(Secret,Guess));
    }
    public static String getHint(String secret, String guess) {
        if(secret.length()<1||secret.length()!=guess.length())
            return 0+"A"+0+"B";
        else{
            int bulls=0;
            int cows=0;
            int length=guess.length();
            HashMap<Character,Integer> hashMap=new HashMap<>();
            List<Character> list=new ArrayList<>();
            for(int i=0;i<length;i++){
                if(secret.charAt(i)==guess.charAt(i))
                    bulls++;
                else{
                    if(!hashMap.containsKey(secret.charAt(i))){
                        hashMap.put(secret.charAt(i),1);
                    }
                    else{
                        hashMap.put(secret.charAt(i),hashMap.get(secret.charAt(i))+1);

                    }
                    list.add(guess.charAt(i));
                }
            }
            for(int i=0;i<list.size();i++){
                if(hashMap.containsKey(list.get(i))){
                    hashMap.put(list.get(i),hashMap.get(list.get(i))-1);
                    if(hashMap.get(list.get(i))<1)
                        hashMap.remove(list.get(i));
                    cows++;
                }
            }
            return bulls+"A"+cows+"B";
        }
    }
}
