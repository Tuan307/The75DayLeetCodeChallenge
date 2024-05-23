public class containMostWater {
    public int maxArea(int[] height) {
        int maxResult = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int value = (r - l) * findMinValue(height[l], height[r]);
            if (value > maxResult) {
                maxResult = value;
            }
            if (height[l] == height[r]) {
                l++;
                r--;
            } else if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxResult;
    }

    public int findMinValue(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Answer: "+new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
    }
}
