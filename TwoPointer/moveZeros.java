package TwoPointer;

public class moveZeros {
    public void moveZeroes(int[] nums){
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        moveZeros mz = new moveZeros();
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        System.out.print("Array after moving zeros: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
