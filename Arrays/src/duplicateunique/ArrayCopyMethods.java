package duplicateunique;

import java.util.Arrays;

public class ArrayCopyMethods {

    public static void main(String[] args) {

        int[] a = {3, 2, 5, 2, 6, 8, 4, 6, 9, 5};
        int[] b = new int[a.length];
        int count = 0;
        boolean p;

        for (int i = 0; i < a.length; i++) {
            p = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    p = true;
                    System.out.println("Duplicate : " + a[i]);
                }
            }
            if (!p) {
                b[count++] = a[i];
            }
        }
        int[] res = new int[count];
        System.arraycopy(b, 0, res, 0, count);
        System.out.println(Arrays.toString(res));
    }
}
