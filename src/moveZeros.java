public class moveZeros {

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[left];
                nums[left] =tmp;
                left++;
            }
        }

    }

    public static void main(String[] args) {
        int[] test = new int[] { 0, 1, 3, 0, 5 };
        moveZeroes(test);
        for (int i : test) {
            System.out.println(i);
        }
    }
}
