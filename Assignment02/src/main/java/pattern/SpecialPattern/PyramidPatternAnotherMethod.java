package pattern.SpecialPattern;

import java.util.Scanner;

//    *
//  * * *
//* * * * *
public class PyramidPatternAnotherMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        int nSpace = a-1;
        int nStars = 1;

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= nSpace; j++) {
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= nStars; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
            nSpace--;
            nStars+=2;
        }
    }
}
