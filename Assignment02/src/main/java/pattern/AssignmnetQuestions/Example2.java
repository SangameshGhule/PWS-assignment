package pattern.AssignmnetQuestions;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
