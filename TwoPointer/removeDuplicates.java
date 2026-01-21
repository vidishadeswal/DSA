package TwoPointer;

public class removeDuplicates {
    public int removeDuplicates(int[] nums){
        if(nums.length==0) return 0;
        int left=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[left-1]){ 
                nums[left]=nums[i];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int[] nums = {1,1,2,2,3,4,4,5};
        int newLength = rd.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
