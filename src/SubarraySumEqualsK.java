import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefixSum = 0;
        hm.put(0, 1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(hm.containsKey(prefixSum - k)){
                result +=hm.get(prefixSum-k);
            }
            hm.put(prefixSum, hm.getOrDefault(prefixSum,0) + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
