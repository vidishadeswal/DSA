package TwoPointer;
import java.util.HashMap;

public class TwoSum {
    public int[] TwoSum(int[] nums, int target){
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(seen.containsKey(diff)){
                return new int[]{seen.get(diff),i};
            }
            seen.put(nums[i],i);
        }
        return new int[]{};
        
    }
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=ts.TwoSum(nums,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
