package ArrayAssignment;

import java.util.Scanner;

//Find the second-largest element in the given Array in one pass.
public class Example2 {

    public static void main(String[] args) {

        int[] a = {4, 10, 2, 3, 5, 8, 7, 9};
        int max = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int secondMax = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int j : a) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }
}
