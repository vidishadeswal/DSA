package PrefixSum;

public class FindPivotIndex {
    public int pivotIndex(int[] nums){
        int total=0;
        int left=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(left==right){
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        FindPivotIndex fp=new FindPivotIndex();
        int nums[]={1,7,3,6,5,6};
        System.out.println(fp.pivotIndex(nums)); // Output: 3
    }
}

