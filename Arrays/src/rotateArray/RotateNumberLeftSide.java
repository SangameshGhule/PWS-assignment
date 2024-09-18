package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateNumberLeftSide {

    public static void main(String[] args) {

        //3 from right to left
        //output will be 7,9,1,5,3,7,5,3,5

        int[] a = {5, 3, 7, 5, 3, 5, 7, 9, 1};    //535735 197  //79153735
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int start = a.length-num;
        num = num > a.length ? num % a.length: num;

        reverseArray(a, start, a.length);
        reverseArray(a, 0, a.length-num);
        reverseArray(a, 0, a.length);
    }

    private static void reverseArray(int[] a, int start, int num) {
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
