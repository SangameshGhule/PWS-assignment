package org.example;

import java.util.Scanner;

public class MultiplyOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a= sc.nextInt();

        for(int i=0;i<10;i++){
            System.out.println(a);
            a= a*2;

        }
    }
}
