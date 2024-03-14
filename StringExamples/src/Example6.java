//Input a string and concatenate with its reverse string and print it.

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        char[] ch = new char[sb.length()];
        int j = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            ch[j] = sb.charAt(i);
            j++;
        }
        System.out.println(sb.append(ch));
    }
}
