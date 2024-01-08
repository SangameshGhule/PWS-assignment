package pattern.SpecialPattern;

import java.util.Scanner;

//1
//1 3
//1 3 5
//1 3 5 7
public class Example1Number1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(b+" ");
                b=b+2;
            }
            System.out.println();
        }
    }
}
