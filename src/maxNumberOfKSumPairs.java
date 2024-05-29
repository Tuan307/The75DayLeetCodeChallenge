import java.util.Arrays;

public class maxNumberOfKSumPairs {

    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[right] + nums[left] == k) {
                count++;
                left++;
                right--;
            } else if (nums[right] + nums[left] > k) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3}, 6));
    }
}
