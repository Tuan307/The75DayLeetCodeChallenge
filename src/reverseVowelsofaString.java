import java.util.ArrayList;
import java.util.List;

public class reverseVowelsofaString {
    public static String reverseVowels(String s) {
        char[] check = s.toCharArray();
        List<Character> vowelList = new ArrayList<Character>();
      vowelList.add('a');
        vowelList.add('u');
        vowelList.add('o');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('A');
        vowelList.add('U');
        vowelList.add('O');
        vowelList.add('E');
        vowelList.add('I');
        int i = 0;
        int j = s.length() - 1;

        while (i < s.length() - 1) {
             if (i >= j) {
                break;
            }
            if (vowelList.contains(check[i]) && vowelList.contains(check[j])) {
                Character tmp = check[i];
                check[i] = check[j];
                check[j] = tmp;
                i++;
                j--;
            } else if (vowelList.contains(check[i]) && !vowelList.contains(check[j])) {
                j--;
            } else if (!vowelList.contains(check[i]) && vowelList.contains(check[j])) {
                i++;
            }else{
                i++;
                j--;
            }
        }
        return String.valueOf(check);
    }

    public static void main(String[] args) {
        System.out.println("Result" + reverseVowels(" apG0i4maAs::sA0m4i0Gp0"));
    }
}
