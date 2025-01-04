import java.util.Arrays;
import java.util.Collections;

public class removeduplicate {

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int k = removeDuplicates(new int[] { 1, 1, 2 });
        System.out.println("euslt: " + k);
    }

}
