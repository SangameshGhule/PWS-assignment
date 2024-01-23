
//Write a function which accepts a 2D array of integers and its size as arguments and displays the
//elements of middle row and the elements of middle column.
public class Example6 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {8, 7, 6, 5, 4}, {1, 2, 37, 8, 0}};

        displayMiddleRowAndColumn(a);
    }

    // Function to display middle row and middle column
    static void displayMiddleRowAndColumn(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Display middle row
        int middleRow = rows / 2;
        int middleColumn = columns / 2;
        System.out.println("Middle Row Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (middleRow == i || middleColumn == j) System.out.print(matrix[i][j] + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

