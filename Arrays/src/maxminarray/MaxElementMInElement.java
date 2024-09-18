package maxminarray;

public class MaxElementMInElement {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 10, 2, 6, 8, 4, 6, 9, 5};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);

        for (int i = 1; i < a.length; i++) {
            if (max > a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
