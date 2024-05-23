import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        // hm.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        // if (hm.containsKey(target - nums[i]) && i != hm.get(target - nums[i])) {
        // return new int[] { i, hm.get(target - nums[i]) };
        // }
        // }
        // return new int[] {};

        // more optimize way
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[] { i, hm.get(target - nums[i]) };
            }
            hm.put(nums[i], i);
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 2, 7, 15, 6 }, 9));
    }
}
