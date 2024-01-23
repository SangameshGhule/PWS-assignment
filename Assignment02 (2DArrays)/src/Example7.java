public class Example7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2, 3, 4}, {1, 4, 1, 2}};
        int sum = 0;
        int col = matrix[0].length;
        for (int row = 0; row < 4; row++) {
            sum = sum + matrix[row][col];
        }
        System.out.println(sum);
    }
}

//Output : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//	at Example7.main(Example7.java:7)