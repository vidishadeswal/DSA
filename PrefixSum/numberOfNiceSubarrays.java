package PrefixSum;
import java.util.HashMap;

public class numberOfNiceSubarrays {
    public int numberOfNiceSubarrays(int[] nums, int k){
        HashMap<Integer,Integer> seen=new HashMap<>();
        seen.put(0,1);
        int count=0;
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i]%2;
            if(seen.containsKey(prefixSum-k)){
                count+=seen.get(prefixSum-k);
            }
            seen.put(prefixSum,seen.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        numberOfNiceSubarrays ns=new numberOfNiceSubarrays();
        int nums[]={1,1,2,1,1};
        int k=3;
        System.out.println(ns.numberOfNiceSubarrays(nums,k)); // Output: 2
    }
}
