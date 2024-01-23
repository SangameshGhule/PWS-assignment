//Write a program to print the elements of both the diagonals in a square matrix.

public class Example8 {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] a = {{1, 2, 3, 4, 5}, {4, 5, 6,7,8}, {7, 8, 9,0,1},{4, 5, 6,7,8}, {7, 8, 9,0,1}};

        System.out.println("Main Diagonal:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j == a.length - 1 - i) {
                    System.out.print(a[i][a.length - 1 - i]);
                } else if (i == j) {
                    System.out.print(a[i][i]);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

