package pattern.SpecialPattern;

import java.util.Scanner;

//*     *
//  * *
//   *
//  * *
//*     *
public class XPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if(i==j || (i+j==a+1)) {
                    System.out.print("*" + " ");
                }else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
