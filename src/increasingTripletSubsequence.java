public class increasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        boolean isValid = false;
        if (nums.length < 3) {
            return false;
        }
        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];

        int minValue = nums[0];
        int maxValue = nums[nums.length-1];
        leftMin[0] = minValue;
        rightMax[nums.length - 1] = maxValue;
        for (int i = 1; i < nums.length; i++) {
            if (minValue > nums[i]) {
                minValue = nums[i];
            }
            leftMin[i] = minValue;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
            }
            rightMax[i] = maxValue;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftMin[i] < nums[i] && nums[i] < rightMax[i]) {
                isValid = true;
            }
        }

        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[] { 6,7,1,2 }));
    }
}
