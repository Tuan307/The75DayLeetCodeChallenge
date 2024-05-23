import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class longestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int maxValue = 0;
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            mySet.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int num = nums[i];
            // find continue in left
            while (mySet.contains(--num)) {
                count++;
                mySet.remove(num);
            }

            num = nums[i];
            // find continue in right
            while (mySet.contains(++num)) {
                count++;
                mySet.remove(num);
            }
            maxValue = Math.max(maxValue, count);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 1, 2 };
        System.out.println(longestConsecutive(nums));
    }
}
