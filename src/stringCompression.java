public class stringCompression {
    // public static int compress(char[] chars) {
    // String result = "";
    // int startIndex = 0;
    // while (startIndex < chars.length) {
    // int count = 0;
    // int tmp = startIndex;
    // for (int j = tmp; j < chars.length; j++) {
    // if (chars[tmp] == chars[j]) {
    // count = count + 1;
    // if (j == chars.length - 1) {
    // startIndex = chars.length;
    // break;
    // }
    // } else {
    // startIndex = j;
    // break;
    // }
    // }
    // result = result + String.valueOf(chars[tmp]);
    // if (count != 1) {
    // result += String.valueOf(count);
    // }
    // }
    // System.out.println(result);
    // char[] compressedChars = result.toString().toCharArray();
    // System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
    // return result.length();
    // }

    public static int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count += 1;
            } else {
                str.append(chars[i]);
                if (count > 1) {
                    str.append(String.valueOf(count));
                }
                count = 1;
            }
        }
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[] { 'a','a','a','b','b' }));
    }
}
