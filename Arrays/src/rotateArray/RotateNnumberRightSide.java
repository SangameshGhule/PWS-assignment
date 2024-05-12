package rotateArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class RotateNnumberRightSide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int[] a = {5, 3, 7, 5, 3, 5, 7, 9, 1};
        int[] res = new int[a.length];

        num = num % a.length;
        int[] temp = new int[num];

//      System.arraycopy(a, 0, temp, 0, temp.length);
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i];
        }
        System.out.println(Arrays.toString(temp));

        //System.arraycopy(a, num, res, num - num, a.length - num);
        for (int i = num; i < a.length; i++) {
            res[i - num] = a[i];
        }

        //System.arraycopy(temp, 0, res, a.length - num + 0, temp.length);
        for (int i = 0; i < temp.length; i++) {
            res[a.length - num + i] = temp[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
