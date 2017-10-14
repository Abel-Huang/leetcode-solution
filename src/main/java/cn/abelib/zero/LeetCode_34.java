package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/13.
 * Binary search, be careful of the range of the two indexes.
 */
public class LeetCode_34 {
    public static void main(String args[]){
        int nums[]={3};
        int target=8;
        int haha[]=searchRange(nums,target);
        for(int i=0;i<haha.length;i++)
            System.out.print(haha[i]+" ");
    }
    public static int[] searchRange(int[] nums, int target) {
        int pos[]={-1,-1},tag=0;
        if(nums.length==0||target<nums[0]||target>nums[nums.length-1]){
          return pos;
        }
        else{
            int end=nums.length-1;
            int front=0;
            int mid=(end-front)/2+front;
            while(front<=end){
                mid=(end-front)/2+front;
                if(nums[mid]==target){
                    tag=1;
                    break;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    front=mid+1;
                }
            }
            if(tag==1){
                int first=mid;
                int second=mid;
                while(nums[first]==target){
                    pos[0]=first;
                    first--;
                    if(first<0)
                        break;
                }
                while (nums[second]==target&&second<nums.length){
                    pos[1]=second;
                    second++;
                    if(second>=nums.length)
                        break;
                }
            }
            return pos;
        }
    }
}
