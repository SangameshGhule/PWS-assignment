package ArrayAssignment;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Example16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        long res = 1;
        for (int i = a; i > 0; i--) {
           res= res*i;
        }
        System.out.println(BigInteger.valueOf(res));
    }
}
