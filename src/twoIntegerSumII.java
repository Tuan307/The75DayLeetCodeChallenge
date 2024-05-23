import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twoIntegerSumII {

    public static int[] twoSum(int[] numbers, int target) {
        // HashMap solution
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int i = 0; i < numbers.length; i++) {
        // hm.put(numbers[i], i);
        // }
        // for (int i = 0; i < numbers.length; i++) {
        // if (hm.containsKey(target - numbers[i])) {
        // System.out.println((i + 1) + " and " + (hm.get(target - numbers[i]) + 1));
        // return new int[] { i + 1, hm.get(target - numbers[i]) + 1 };
        // }
        // }

        // two pointer solution
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println("Answer: " + twoSum(new int[] { -1, 0 }, -1));
    }
}
