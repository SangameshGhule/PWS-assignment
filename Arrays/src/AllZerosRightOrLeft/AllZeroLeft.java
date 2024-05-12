package AllZerosRightOrLeft;

import java.util.Arrays;

public class AllZeroLeft {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 0, 2, 0, 3, 0, 0, 9};
        int[] r = new int[a.length];
        int count = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            int k = a[i];
            if (k != 0) {
                r[j] = k;
                j++;
            } else {
                count++;
            }
        }
        reverseArray(r, 0, j);
        reverseArray(r, 0, r.length);
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
