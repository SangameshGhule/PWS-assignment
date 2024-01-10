package pattern.AssignmnetQuestions;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 2 * num - 1; i++) {
            int stars;
            if (i <= num) stars = i;
            else stars = 2 * num - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


