package pattern.AssignmnetQuestions;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" " + " ");
            }
            int count = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
