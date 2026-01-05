package TwoPointer;

public class TwoSumInputArray {
    public int[] TwoSum(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSumInputArray ts=new TwoSumInputArray();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=ts.TwoSum(nums,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
