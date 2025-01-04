import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class keyboardRow {

    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        List<Character> rowFirst = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        List<Character> rowSecond = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        List<Character> rowThird = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
        for (int i = 0; i < words.length; i++) {
            Set<Character> mySet = new HashSet<Character>();
            char[] tmp = words[i].toLowerCase().toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                mySet.add(tmp[j]);
            }
            boolean checkValue = true;
            char firstElement = mySet.iterator().next();
            if (rowFirst.contains(firstElement)) {
                for (char value : mySet) {
                    if (!rowFirst.contains(value)) {
                        checkValue = false;
                    }
                }
            } else if (rowSecond.contains(firstElement)) {
                for (char value : mySet) {
                    if (!rowSecond.contains(value)) {
                        checkValue = false;
                    }
                }
            } else {
                for (char value : mySet) {
                    if (!rowThird.contains(value)) {
                        checkValue = false;
                    }
                }
            }
            if (checkValue == true) {
                result.add(words[i]);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Check " + result.get(i));
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] checkRow = new String[] { "Hello", "Alaska", "Dad", "Peace" };
        findWords(checkRow);
    }
}