import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class uniqueElementInArr {

    public static int singleNumber(int[] nums) {
        // cach dung hashmap
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (hm.containsKey(nums[i])) {
        // hm.put(nums[i], hm.get(nums[i]) + 1);
        // } else {
        // hm.put(nums[i], 1);
        // }
        // }
        // for (Map.Entry<Integer, Integer> value : hm.entrySet()) {
        // if (value.getValue() == 1) {
        // return value.getKey();
        // }
        // }
        // return 0;

        //XOR Solution (^)
        /*
         * a xor 0 (a^0) = a
         * a ^ a = 0
         * a^b^c = a^c^b = b^a^c = ...
         */

        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + singleNumber(new int[] { 4, 1, 1, 2, 2 }));
    }
}