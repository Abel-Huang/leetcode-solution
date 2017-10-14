package cn.abelib.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/28.
 * This is my fastest runtime, I beat more than 95% submissions in Java,
 * my idea is building a good map value type to store all isAnagram string
 * of this string array.
 */
public class LeetCode_49 {
    public static void main(String args[]){
        String s[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print(groupAnagrams(s).toString());
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length<1)
            return null;
        List<List<String>> lists=new ArrayList<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        int index=0;
        for(int i=0;i<strs.length;i++){
            if(!hashMap.containsKey(isAnagram(strs[i]))){
                hashMap.put(isAnagram(strs[i]),new Integer(index));
                List<String> strlist=new ArrayList<>();
                strlist.add(strs[i]);
                lists.add(strlist);
                index++;
            }
            else{
                lists.get((hashMap.get(isAnagram(strs[i]))).intValue()).add(strs[i]);
            }
        }
        return lists;
    }
    public static String isAnagram(String s){
        if(s.length()<=1)
            return s;
        char str[]=s.toCharArray();
        char additionC;
        int index=0;
        for(int i=0;i<str.length;i++){
            additionC=str[i];
            index=i;
            for(int j=i+1;j<str.length;j++){
                if(additionC>=str[j]){
                    additionC=str[j];
                    index=j;
                }
            }
            str[index]=str[i];
            str[i]=additionC;
        }
        return new String(str);
    }
}
