package TwoPointer;
import java.util.*;

public class ThreeSumClosest {
    public int threeSumCloest(int[] nums, int target){
        if(nums==null || nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(currSum-target)<Math.abs(closestSum-target)){
                    closestSum=currSum;
                }
                else if(currSum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        ThreeSumClosest tsc=new ThreeSumClosest();
        int[] nums={-1,2,1,-4};
        int target=1;
        int result=tsc.threeSumCloest(nums,target);
        System.out.println("Closest Sum: " + result);
    }
}

