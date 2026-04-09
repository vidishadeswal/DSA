package PrefixSum;
import java.util.HashMap;

public class ContinuousSubarraySum {
    public boolean ContinuousSubarraySum(int[] nums, int k){
        HashMap<Integer,Integer> seen=new HashMap<>();
        seen.put(0,-1); //-1 because if we get remainder 0 at index 1, then subarray from 0 to 1 is valid
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int rem=prefixSum%k; //this is the prev index where this remainder was seen
            if(rem<0){
                rem+=k;
            }
            if(seen.containsKey(rem)){
                if(i-seen.get(rem)>=2){ //length we calculate by i-prevIndex
                    return true;
                }
            }else{
                seen.put(rem,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContinuousSubarraySum cs=new ContinuousSubarraySum();
        int nums[]={23,2,4,6,7};
        int k=6;
        System.out.println(cs.ContinuousSubarraySum(nums, k)); 
    }
}
