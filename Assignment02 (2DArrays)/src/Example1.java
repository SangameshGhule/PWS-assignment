import java.util.Arrays;

//Write a program to store 10 at every index of a 2D matrix with 5 rows and 5 columns.
public class Example1 {

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]= 10;
            }
        }
        //one way of printing
//        for(int[] ele:a){
//            System.out.println(Arrays.toString(ele));
//        }

        //Another way of printing
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
