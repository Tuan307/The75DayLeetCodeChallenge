public class IsSubsequence {
    
    public static boolean isSubsequence(String s, String t) {
        if(s.length() ==0 || t.length() ==0) return false;
        int i=0,j=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i) == (s.charAt(j))){
                j++;
            }
            i++;
        }
        return (s.length() == j);
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b","abc"));
    }
}
