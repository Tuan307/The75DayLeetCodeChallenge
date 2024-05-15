import java.util.Arrays;

public class productofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int mulTotal = 1;
        int[] leftToRight = new int[nums.length];
        int[] rightToLeft = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            leftToRight[i] = mulTotal;
            mulTotal = mulTotal * nums[i];
        }
        mulTotal = 1;
        for (int i = nums.length-1; i >=0; i--) {
            rightToLeft[i] = mulTotal;
            mulTotal = mulTotal * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftToRight[i] * rightToLeft[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] { 4,5,1,8,2 })));
    }
}
