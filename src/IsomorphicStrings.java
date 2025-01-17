import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm1.put(String.valueOf(s.charAt(i)), hm1.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
            hm2.put(String.valueOf(t.charAt(i)), hm2.getOrDefault(String.valueOf(t.charAt(i)), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(hm1.get(String.valueOf(s.charAt(i))) != hm2.get(String.valueOf(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
