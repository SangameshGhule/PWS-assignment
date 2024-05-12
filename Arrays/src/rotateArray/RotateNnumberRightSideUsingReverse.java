package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateNnumberRightSideUsingReverse {

    //This solution is optimal
    public static void main(String[] args) {

        int[] a = {5, 3, 7, 5, 3, 5, 7, 9, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int start = 0;
        num = num % a.length;

        reverseArray(a, num, start);
        reverseArray(a, a.length, num);
        reverseArray(a, a.length, 0);
    }

    private static void reverseArray(int[] a, int num, int start) {
        while (start <= num - 1) {
            int temp = a[start];
            a[start] = a[num - 1];
            a[num - 1] = temp;
            start++;
            num--;
        }
        System.out.println(Arrays.toString(a));
    }
}
