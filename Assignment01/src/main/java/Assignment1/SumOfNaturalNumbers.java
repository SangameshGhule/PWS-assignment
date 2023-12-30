package Assignment1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = sc.nextInt();
        int res = 0;
        for(int i= 0; i<=num;i++){
            res= res+i;
        }
        System.out.println(res);
    }
}
