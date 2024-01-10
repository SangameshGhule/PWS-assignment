package pattern.AssignmnetQuestions;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                System.out.print(i + " ");
            } else {
                System.out.print(i - 2 * k + " ");
                k++;
            }
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
