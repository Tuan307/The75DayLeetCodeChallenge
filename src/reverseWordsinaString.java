public class reverseWordsinaString {


    public static String reverseWords(String s) {
        String re = s.trim();
        re = re.replaceAll("\\s+"," ");
        String[] se = re.split(" ");
        String result = "";
        for(int i=se.length-1;i>=0;i--){
            if(i == 0){
                result = result + se[i]; 
            }else{
                result = result + se[i]+ " "; 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("    the     sky is        blue"));
    }
}