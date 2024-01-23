package ArrayAssignment;

import javax.swing.*;

//WAP to find the largest three elements in the array.
public class Example7 {

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 26, 25, 18, 30};

        findLargestThreeElements(array);
    }

    public static void findLargestThreeElements(int[] array) {
        if (array.length < 3) {
            System.out.println("Array should have at least three elements.");
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = j;
            } else if (j > thirdLargest) {
                thirdLargest = j;
            }
        }

        System.out.println("Largest three elements in the array are: ");
        System.out.println("1. " + firstLargest);
        System.out.println("2. " + secondLargest);
        System.out.println("3. " + thirdLargest);
    }
}
