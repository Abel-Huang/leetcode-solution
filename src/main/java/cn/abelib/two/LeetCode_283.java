package cn.abelib.two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  abel-huang on 2016/7/11.
 * use list
 */
public class LeetCode_283 {
    public static void main(String args[]) {
        int nums[]={0, 1, 0, 3, 12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int len1=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(new Integer(nums[i]));
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<list.size()){
                nums[i]=list.get(i);
            }
            else{
                nums[i]=0;
            }
        }
    }
}
