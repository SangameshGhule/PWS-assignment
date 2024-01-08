package pattern.Square;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        System.out.println("Enter the col");
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
