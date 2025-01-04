public class longestSubarrayofoneAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {
        int k = 1;
        int countZero = 0;
        int result = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
            if (k < countZero) {
                if (nums[left] == 0) {
                    countZero--;
                }
                left++;
            } else {
                result = Math.max(result, i + 1 - left);
            }
        }
        return result - 1;
    }

    public static void main(String[] args) {

    }

}
