
//Write a program to print the row number having the maximum sum in a given matrix.
public class Example5 {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {3, 4, 7, 8}, {1, 4, 12, 3}};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum = sum + a[i][j];
                if (sum > max) {
                    max = sum;
                    index = i;
                }
            }
            sum = 0;
        }
        System.out.println(max + " " + index);
    }
}
