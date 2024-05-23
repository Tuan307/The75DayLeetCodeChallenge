import java.util.Arrays;

public class containsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                result = true;
            } else {
                if (count > 1) {
                    result = true;
                }
                count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean re = containsDuplicate(new int[] { 1 });
        System.out.println(re);
    }
}
