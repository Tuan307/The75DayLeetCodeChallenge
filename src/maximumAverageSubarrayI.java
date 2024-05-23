public class maximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        double totalAvg = 0;
        for (int i = 0; i < k; i++) {
            totalAvg = totalAvg + nums[i];
        }
        double maxTotal = totalAvg;
        for (int i = 0; i < nums.length - k; i++) {
            totalAvg = totalAvg - nums[i];
            totalAvg = totalAvg + nums[i + k];
            if (maxTotal < totalAvg) {
                maxTotal = totalAvg;
            }
        }
        return maxTotal / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
    }
}
