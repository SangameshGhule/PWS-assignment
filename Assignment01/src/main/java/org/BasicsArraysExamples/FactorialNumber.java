package org.BasicsArraysExamples;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the number :");
        int a= sc.nextInt();
        int res=1;
        for(int i=a; i>=1; i--){
            res= res*i;
        }
        System.out.println(res);
    }
}
