import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class groupAnagrams {

    public static String sortString(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (!hm.containsKey(sortString(strs[i]))) {
                List<String> s = new ArrayList<>();
                s.add(strs[i]);
                hm.put(sortString(strs[i]), s);
            } else {
                List<String> s = new ArrayList<>();
                s.addAll(hm.get(sortString(strs[i])));
                s.add(strs[i]);
                hm.put(sortString(strs[i]), s);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (Entry<String, List<String>> entry : hm.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
    }
}
