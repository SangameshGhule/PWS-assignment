package org.example;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(b!=0){
            int res= a&b;
            a=a^b;
            b=res<<1;
        }
        System.out.println("sum is"+a);
    }
}
