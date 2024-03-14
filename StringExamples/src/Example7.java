//Q7. Find the second largest digit in the string consisting of digits from ‘0’ to ‘9’.

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        String input = "012345f6789";

        char first = '0';
        char second = '0';

        for (char digit : input.toCharArray()) {
            if (Character.isDigit(digit)) {
                if (digit > first) {
                    second = first;
                    first = digit;
                } else if (digit > second && digit < first) {
                    second= digit;
                }
            }
        }

        if (second == '0') {
            System.out.println("No second largest digit found.");
        } else {
            System.out.println("The second largest digit is: " + second);
        }
    }

}
