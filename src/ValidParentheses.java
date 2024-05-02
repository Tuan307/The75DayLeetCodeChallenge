import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String pattern) {
        Stack<Character> stack = new Stack<>();
        for (char ch : pattern.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char check = stack.pop();
                if ((check == '{' && ch != '}') || (check == '[' && ch != ']') || (check == '(' && ch != ')')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        String pattern = sc.nextLine(); // Read user input
        System.out.println(isValid(pattern));
    }
}
