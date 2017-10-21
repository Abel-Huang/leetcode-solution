package cn.abelib.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/10.
 * use hashtable to mark the first array's element one time
 * and find the same element of this hashtable int second
 * array
 */
public class LeetCode_349 {
    public static void main(String args[]){
        int a[]={}, b[]={};
        int c[]=intersection(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!hashMap.containsKey(new Integer(nums1[i])));
            hashMap.put(new Integer(nums1[i]),new Integer(i));
        }
        for(int i=0;i<nums2.length;i++){
            if(hashMap.containsKey(new Integer(nums2[i]))){
                list.add(new Integer(nums2[i]));
                hashMap.remove(new Integer(nums2[i]));
            }
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i).intValue();
        }
        return result;
    }
}
