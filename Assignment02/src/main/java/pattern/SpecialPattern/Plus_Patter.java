package pattern.SpecialPattern;

import java.util.Scanner;

//          *
//          *
//        *****
//          *
//          *
public class Plus_Patter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        int mid = a/2+1;
        if(a%2==0) throw new RuntimeException("Enter odd num");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if(i==mid ||j==mid) {
                    System.out.print("*" + " ");
                }else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
