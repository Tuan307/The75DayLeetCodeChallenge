public class HighestAltitude{
    public static int largestAltitude(int[] gain) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            result = Math.max(sum, result); 
        }
        if(result <0) result = 0;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}