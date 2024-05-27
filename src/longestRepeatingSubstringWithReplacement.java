import java.util.HashMap;

public class longestRepeatingSubstringWithReplacement {
    public static int characterReplacement(String s, int k) {
        int result = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int maxSub = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
            maxSub = Math.max(maxSub, hm.get(s.charAt(i)));

            if (i - left + 1 - maxSub > k) {
                hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, i - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
}
