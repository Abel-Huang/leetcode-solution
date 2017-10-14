package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/6.
 */
public class LeetCode_1 {
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;
        //System.out.println(new String(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        int tag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    result[0] = i;
                    result[1] = j;
                    tag=1;
                    break;
                }
            }
            if(tag==1)
                break;
        }
        return result;
    }
}
