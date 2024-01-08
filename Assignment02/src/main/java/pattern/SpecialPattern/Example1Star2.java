package pattern.SpecialPattern;

import java.util.Scanner;
//* * * *
//* * *
//* *
//*
public class Example1Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
