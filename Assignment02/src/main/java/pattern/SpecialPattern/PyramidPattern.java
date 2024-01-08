package pattern.SpecialPattern;

import java.util.Scanner;

//    *
//  * * *
//* * * * *
public class PyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
