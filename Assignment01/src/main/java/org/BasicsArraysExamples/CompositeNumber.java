package org.BasicsArraysExamples;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the number :");
        int a= sc.nextInt();
        for(int i= 2;i<=a-1;i++){
            if(a%i==0){
                System.out.println(i);
                System.out.println("CompositeNumber");
            }
        }
    }
}
