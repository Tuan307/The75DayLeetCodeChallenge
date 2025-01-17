import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (hm2.containsKey(String.valueOf(magazine.charAt(i)))) {
                hm2.put(String.valueOf(magazine.charAt(i)), hm2.get(String.valueOf(magazine.charAt(i))) + 1);
            } else {
                hm2.put(String.valueOf(magazine.charAt(i)), 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hm2.containsKey(String.valueOf(ransomNote.charAt(i)))
                    || (hm2.get(String.valueOf(ransomNote.charAt(i))) == 0)) {
                return false;
            } else {
                hm2.put(String.valueOf(ransomNote.charAt(i)), (hm2.get(String.valueOf(ransomNote.charAt(i))) - 1));
            }
        }
        return true;
    }
}
