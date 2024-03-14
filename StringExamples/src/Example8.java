import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = countVowelSubstrings(input);
        System.out.println("Number of substrings containing only vowels: " + count);
    }

    static int countVowelSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count += (n - i) * (i + 1);
            }
        }
        return count;
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

