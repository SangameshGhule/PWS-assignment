import java.util.Scanner;

public class HalfStringReverseUsingBildInMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        String inputString = sc.nextLine();

        // Use StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(inputString).reverse();

        // Print the result
        System.out.println(inputString + reversedString);
    }
}
