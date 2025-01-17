// với các case sliding window không cho biết trước số K thì cần dùng tới cả two pointer, thường sẽ là 1 pointer left và right, bắt đầu từ 0 , 1 hoặc 0,0 rồi di chuyển dần về cuối
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (result == Integer.MAX_VALUE)
            result = 0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("result " + minSubArrayLen(11, new int[] { 1,2,3,4,5}));
    }
}
