package ArrayAssignment;

import java.util.Scanner;

//Calculate the product of all the elements in the given array.
public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = sc.nextInt();
        int result = 1;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            result = result * j;
        }
        System.out.println("product of all the elements : " + result);
    }
}
