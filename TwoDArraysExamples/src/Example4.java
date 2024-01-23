//Write a program to find the largest element of a given 2D array of integers.

import com.sun.jdi.Value;

public class Example4 {
    public static void main(String[] args) {

        int[][] a = {{1, 3, 4, 6}, {2, 4, 5, 7}, {3, 5, 6, 8}, {4, 6, 7, 9}};
        int max = 0;
        int res = 0;
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                res = Math.max(ints[j], max);
            }
        }
        System.out.println(res);
    }
}
