import java.util.ArrayList;
import java.util.List;

public class maximumNumberofVowelsinaSubstringofGivenLength {

    public static int maxVowels(String s, int k) {
        List<Character> vowCharacters = new ArrayList<>();
        vowCharacters.add('u');
        vowCharacters.add('e');
        vowCharacters.add('o');
        vowCharacters.add('a');
        vowCharacters.add('i');
        int maxTotal = 0;
        int total = 0;
        for (int i = 0; i < k; i++) {
            if (vowCharacters.contains(s.charAt(i))) {
                total = total + 1;
            }
        }
        maxTotal = total;
        for (int i = 0; i < s.length() - k; i++) {
            if (vowCharacters.contains(s.charAt(i))) {
                total = total - 1;
            }
            if (vowCharacters.contains(s.charAt(i + k))) {
                total = total + 1;
            }
            if (maxTotal < total) {
                maxTotal = total;
            }
        }
        return maxTotal;
    }

    public static void main(String[] args) {
        System.out.println("Ans:"+maxVowels("abciiidef", 3));
    }
}
