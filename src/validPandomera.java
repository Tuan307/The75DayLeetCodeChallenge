public class validPandomera {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int index = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(index) != (s.charAt(i))) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
