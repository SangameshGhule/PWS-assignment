package ArrayAssignment;

import java.util.Scanner;
//Find the minimum value out of all elements in the array.
public class Example3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int temp = Integer.MAX_VALUE;
        for (int i : a) {
            if (temp >= i) {
                temp = i;
                min = temp;
            }
        }
        System.out.println("Min value from array elements : "+min);
    }
}


