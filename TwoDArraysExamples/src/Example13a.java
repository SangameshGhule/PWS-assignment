//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//You must do it in place.

public class Example13a {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 0, 1}, {1, 6, 7}};
        System.out.println();
        display1(a);

        //making zeroRow and zeroCol as 0 by traversing from index 1 to last
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    a[0][j] = 0;
                    a[i][0] = 0;
                }
            }
        }
        System.out.println();
        display1(a);

        //making zero corresponding to row and column
        for (int i = 1; i < a.length; i++) {
            if (a[i][0] == 0) {
                for (int j = 1; j < a[0].length; j++) {
                    a[i][j] = 0;
                }
            }
        }
        System.out.println();
        display1(a);

        //making zero corresponding to row and column
        for (int j = 1; j < a[0].length; j++) {
            if (a[0][j] == 0) {
                for (int i = 1; i < a.length; i++) {
                    a[i][j] = 0;
                }
            }
        }
        System.out.println();
        display1(a);
    }

    private static void display1(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}
