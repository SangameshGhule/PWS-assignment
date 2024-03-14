//Given a positive integer n, generate a n x n matrix filled with elements from 1 to n2 in spiral order.

import java.util.Arrays;
import java.util.Scanner;

//Input 1: n = 3
//Output 1: [[1,2,3],[8,9,4],[7,6,5]]
public class Example11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int[] ele : a) {
            System.out.println(Arrays.toString(ele));
        }
    }
}
