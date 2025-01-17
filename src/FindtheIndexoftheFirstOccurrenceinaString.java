public class FindtheIndexoftheFirstOccurrenceinaString {
    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        if (haystack.length() == n) {
            if (haystack.equals(needle))
                return 0;
            return -1;
        }
        String tmp = "";
        for (int i = 0; i < n; i++) {
            tmp += String.valueOf(haystack.charAt(i));
        }
        if (needle.equals(tmp))
            return 0;
        int j = 0;
        for (int i = n; i < haystack.length(); i++) {
            StringBuilder sb = new StringBuilder(tmp);
            sb.deleteCharAt(0);
            tmp = sb.toString();
            tmp += String.valueOf(haystack.charAt(i));
            if (tmp.equals(needle))
                return j + 1;
            j++;
        }
        return -1;
    }

    /// Easier solution
    // public int strStr(String haystack, String needle) {
    // return haystack.indexOf(needle);
    // }
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
