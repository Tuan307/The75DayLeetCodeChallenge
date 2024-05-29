import java.util.HashMap;

public class maxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int maxCount = 0;
        int left = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount++;
            }
            if (maxCount > k) {
                if (nums[left] == 0) {
                    maxCount--;
                }
                left++;
            } else {
                result = Math.max(i + 1 - left, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                "Answer" + longestOnes(new int[] { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0,
                        1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1 }, 8));
    }
}
