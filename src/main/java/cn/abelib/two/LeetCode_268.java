package cn.abelib.two;

/**
 * Created by abel-huang on 2016/8/8.
 * the expect_number - true_number.
 */
public class LeetCode_268 {
    public static void main(String args[]) {
       int nums[]={0,1,3};
        System.out.print(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        if(nums.length==0)
            return 0;
        else{
            int sum=0;
            int total=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            for(int i=0;i<=nums.length;i++){
                total+=i;
            }
            return total-sum;
        }
    }
}
