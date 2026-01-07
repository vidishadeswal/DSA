package TwoPointer;
import java.util.*; 

public class FourSumTwo {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int j:nums3){
            for(int k:nums4){
                int sum=j+k;
                seen.put(sum,seen.getOrDefault(sum, 0) + 1);
            }
        }
        int count=0;
        for(int i:nums1){
            for(int j:nums2){
                int sum=-(i+j);
                count+=seen.getOrDefault(sum,0);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        FourSumTwo fst=new FourSumTwo();
        int[] nums1={1,2};
        int[] nums2={-2,-1};
        int[] nums3={-1,2};
        int[] nums4={0,2};
        int result=fst.fourSumCount(nums1,nums2,nums3,nums4);
        System.out.println("Number of tuples: " + result);
    }
}

