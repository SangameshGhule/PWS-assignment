package LInearSearch;

public class LeanerSearch {

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 3, 2};
        int num = 3;
        int result = result(a, num);
        System.out.println(result);
    }

    private static int result(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
