public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length == 0)
            return 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                    j--;
                }
            } else {
                i++;
            }
        }
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != val) {
                k++;
            }
        }
        return k;
    }
}
