package maxminarray;

public class SecondMaxSecondMin {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 15,10, 2, 6, 8, 4, 13, 6, 9, 5, 11, 11, 13, 13,14,14};
        int max = a[0];
        int secondMax = 0;

        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
