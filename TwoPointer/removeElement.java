package TwoPointer;

public class removeElement {
    public int removeElement(int[] nums, int val){
        int left=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[left]=nums[i];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        removeElement re = new removeElement();
        int[] nums = {3,2,2,3,4,5,3};
        int val = 3;
        int newLength = re.removeElement(nums, val);
        System.out.print("Array after removing element " + val + ": ");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
