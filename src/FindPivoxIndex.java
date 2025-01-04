import java.util.HashMap;

public class FindPivoxIndex {
    public static int pivotIndex(int[] nums) {
       int result = -1;
       int prefixSum = 0;
       int[] prefixArr = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        prefixSum += nums[i];
        prefixArr[i] = prefixSum;
       }

       for(int i=0;i<nums.length;i++){
        int left = 0;
        int right=0;
        if(i!=0){
            left =prefixArr[i] - nums[i];
        }
        if(i!= nums.length - 1){
            right = prefixArr[nums.length-1] - prefixArr[i];
        }
        if(left == right){
            result = i;
            break;
        }
       }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("abc"+pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,-1,1}));
    }
}
