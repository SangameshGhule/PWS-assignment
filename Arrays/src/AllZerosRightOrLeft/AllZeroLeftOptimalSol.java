package AllZerosRightOrLeft;

import java.util.Arrays;

public class AllZeroLeftOptimalSol {

    public static void main(String[] args) {

        int[] a = {4, 3, 2, 0, 2, 0, 3, 0, 3};
        moveNonZerosToRight(a);
    }

    private static void moveNonZerosToRight(int[] a) {
        int n = a.length;
        int countNonZero = n - 1;

        // Move non-zero elements to the right side of the array
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {   //3
                int temp = a[i];   //3
                a[i] = a[countNonZero];
                a[countNonZero] = temp;
                countNonZero--;
            }
        }

        // Print the modified array
        System.out.println(Arrays.toString(a));
    }
}

