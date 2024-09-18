import java.util.Arrays;

public class Exm1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] res = new int[a.length];
        int end = a.length - 1;
        int start = 0;

        for (int i = 0; i < a.length; i += 2) {
            res[i] = a[end--];
            if (i + 1 < a.length) {
                res[i + 1] = a[start++];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
