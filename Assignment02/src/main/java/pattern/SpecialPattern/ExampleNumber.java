package pattern.SpecialPattern;

import java.util.Scanner;
//        1
//        1 2
//        1 2 3
//        1 2 3 4
public class ExampleNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
