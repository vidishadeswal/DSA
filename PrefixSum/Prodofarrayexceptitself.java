package PrefixSum;
import java.util.Arrays;

public class Prodofarrayexceptitself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        //left product
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=output[i-1]*nums[i-1];
        }
        //right product
        int rightProd=1;
        for(int i=n-1;i>=0;i--){
            output[i]=output[i]*rightProd;
            rightProd=rightProd*nums[i];
        }
        return output;

    }
    public static void main(String[] args){
        Prodofarrayexceptitself ps=new Prodofarrayexceptitself();
        int nums[]={1,2,3,4,5};
        int result[]=ps.productExceptSelf(nums);
        
        System.out.println(Arrays.toString(result));
        
    }
}
