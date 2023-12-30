package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesNumber {

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum;
        int[] res = new int[a];
        for (int i = 0; i < a; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            res[i] = sum;
        }
        System.out.println(Arrays.toString(res));
    }
}
