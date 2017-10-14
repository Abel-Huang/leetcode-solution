package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/8/7.
 * Count every element numbers and reset the array.
 */
public class LeetCode_75 {
    public static void main(String args[]){
        int nums[]={1,2,0,0,1,2};
        sortColors(nums);
        for(int i:nums){
            System.out.print(" "+i);
        }
    }
    public static void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeros++;
            else if (nums[i]==1)
                ones++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<zeros)
                nums[i]=0;
            else{
                if(i<(ones+zeros))
                    nums[i]=1;
                else
                    nums[i]=2;
            }
        }
    }
}
