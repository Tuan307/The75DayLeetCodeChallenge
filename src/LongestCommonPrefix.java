import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int i = 0;
        while (i < s1.length()) {
            if (String.valueOf(s1.charAt(i)).equals(String.valueOf(s2.charAt(i)))) {
                i++;
            } else {
                break;
            }
        }
        return s1.subSequence(0, i).toString();
    }
}
