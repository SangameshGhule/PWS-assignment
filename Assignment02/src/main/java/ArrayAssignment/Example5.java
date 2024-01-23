package ArrayAssignment;

import java.util.Scanner;

public class Example5 {
    static int findSmallestMissingPositive(int[] arr) {
        int n = arr.length;
        int missing = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= missing) {
                missing += arr[i];
            } else {
                break;
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the smallest missing positive element
        int result = findSmallestMissingPositive(arr);

        // Output the result
        System.out.println("The smallest missing positive element is: " + result);

        scanner.close();
    }
}
