import java.util.Arrays;

//Write a program to add two matrices and save the result in one of the given matrices.
public class Example2 {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{4,5,8},{0,0,8},{1,2,0}};

        int[][] res = new int[a.length][b.length];

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < b.length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int[] ele:res) {
            System.out.println(Arrays.toString(ele));
        }

//        for(int i=0;i<a.length;i++) {
//            for (int j = 0; j < b.length; j++) {
//                System.out.print(res[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
