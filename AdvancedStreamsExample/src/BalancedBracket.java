import java.util.Stack;

public class BalancedBracket {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            // If the character is a closing bracket, check for matching opening bracket
            else if (c == '}' || c == ']' || c == ')') {
                // If stack is empty or the top of the stack doesn't match the closing bracket, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all the brackets were matched; otherwise, return false
        return stack.isEmpty();
    }

    // Helper method to check if the brackets are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }

    public static void main(String[] args) {
        String test1 = "{[4+(6+3)-{4*7}-4*3]}";
        String test2 = "{[4+(6+3)-{4*7}-4*3[}";
        String test3 = "{[4+(6+3(-4*3]}";

        System.out.println(isBalanced(test1)); // true
        System.out.println(isBalanced(test2)); // false
        System.out.println(isBalanced(test3)); // false
    }
}
