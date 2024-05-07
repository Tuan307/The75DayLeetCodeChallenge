import java.util.ArrayList;
import java.util.List;

public class kidsWiththeGreatestNumberofCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int maxCandy = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] { 12,1,12}, 10));
    }

}
