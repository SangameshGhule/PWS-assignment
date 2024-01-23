//. Write a program to rotate the matrix by 90 degrees anti-clockwise.

import java.util.Arrays;

public class Example9 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        display1(a);

        //90 degree clockWise rotate
        //Transpose matrix
        System.out.println("Transpose matrix : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        display1(a);

        //Rotate reverse each row
        //clock wise
        System.out.println("Clock wise : ");
        for (int i = 0; i < a.length; i++) {
            int start = 0, end = a.length - 1;
            while (start <= end) {
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }
        display1(a);

        //Anti clock wise
        //print from last index
        System.out.println("Anti clock wise : ");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void display1(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
