import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] a = {2, 2, 5, 6, 8, 9, 11, 60};
        int[] b = {3, 5, 6, 8, 13, 50};
        int[] c = new int[a.length + b.length];
        int i, j, k = 0;

        for (i = 0; true; ) {
            for (j = 0; j < b.length; ) {
                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    k++;
                    i++;
                } else if (a[i] >= b[j]) {
                    c[k] = b[j];
                    k++;
                    j++;
                }
                if (i == a.length) {
                    c[k] = b[j];
                    break;
                }
                if (j == b.length) {
                    c[k] = a[i];
                    break;
                }
            }
            if (i == a.length || j == b.length) break;
        }
        System.out.println(Arrays.toString(c));
    }
}
