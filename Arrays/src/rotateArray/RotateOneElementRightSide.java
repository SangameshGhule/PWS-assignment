package rotateArray;

import java.util.Arrays;

public class RotateOneElementRightSide {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 8, 1, 5};
        int[] b = new int[a.length];
        int temp = a[0];

//        for (int i = 1; i < a.length; i++) {
//            b[i - 1] = a[i];
//        }
        System.arraycopy(a, 1, b, 0, a.length - 1);
        b[a.length - 1] = temp;
        System.out.println(Arrays.toString(b));
    }
}
