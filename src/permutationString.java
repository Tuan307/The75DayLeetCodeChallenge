import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class permutationString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s1.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        String result = "";
        char[] tmp1 = s1.toCharArray();
        Arrays.sort(tmp1);
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            result = s2.substring(i, i + s1.length());
            char[] tmp2 = result.toCharArray();
            Arrays.sort(tmp2);
            if (Arrays.equals(tmp1, tmp2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("abcd", "lecabee"));
    }
}
