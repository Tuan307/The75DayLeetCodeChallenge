import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap();
        int maxValue = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                start = Math.max(start, hm.get(s.charAt(i)) + 1);
            }
            hm.put(s.charAt(i), i);
            maxValue = Math.max(maxValue,i-start+1);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
