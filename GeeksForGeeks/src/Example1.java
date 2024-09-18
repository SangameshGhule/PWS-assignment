public class Example1 {

    public static void main(String[] args) {

        int a[] = {0, 1, 2, 3};
        int n = a.length;
        int res = 0;
        {
            for (int i = 0; i < n; i++) {
                if (i != 0 && i != n - 1) {
                    if (a[i - 1] <= a[i] && a[i] >= a[i + 1]) {
                        res = 1;
                    }
                } else if (i == n - 1) {
                    if (a[i] >= a[i - 1]) {
                        res = 1;
                    }
                } else {
                    if ((a[i] >= a[i + 1])) {
                        res = 1;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
