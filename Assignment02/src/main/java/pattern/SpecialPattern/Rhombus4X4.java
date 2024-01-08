package pattern.SpecialPattern;

import java.util.Scanner;

public class Rhombus4X4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
