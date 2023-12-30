package Assignment1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        for (int i = num; i <= num * 10; i += num) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Another type
        int res=num;
        for(int i=1;i<=10;i++){
            res= num*i;
            System.out.print(res+" ");
        }
    }
}
