package PrefixSum;
import java.util.HashMap;

public class SubarraySumDivByK {
    public int SubarraySumDivByK(int[] nums, int k){
        HashMap<Integer,Integer> seen=new HashMap<>();
        seen.put(0,1);
        int n=nums.length;
        int prefixSum=0;
        int count=0;
        for(int num:nums){
            prefixSum+=num;
            int div=prefixSum%k;
            if(div<0){
                div=div+k;
            }

            if(seen.containsKey(div)){
                count+=seen.get(div);
            }
            seen.put(div,seen.getOrDefault(div,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        SubarraySumDivByK s=new SubarraySumDivByK();
        int nums[]={4,8,2,9,0};
        int k=5;
        System.out.println(s.SubarraySumDivByK(nums, k));
    }
}
