package pattern.AssignmnetQuestions;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print((char) (i + 64) + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n + 1; j <= 2 * n - i; j++) {
                System.out.print((char) (j + i - 1 + 64) + " ");
            }
            System.out.println(" ");
        }
    }
}
