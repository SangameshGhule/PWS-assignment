//Write a program to print the matrix in wave form.

public class Example10 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Column wise
        for (int j = 0; j < a[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = a[0].length - 1; i >= 0; i--) {
                    System.out.print(a[i][j]);
                }
            } else {
                for (int[] ints : a) {
                    System.out.print(ints[j]);
                }
            }
            System.out.println();
        }

        //Row wise
//        for(int i=0;i<a.length;i++){
//            if(i%2==0) {
//                for (int j = 0; j < a[0].length; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//            }else {
//                for (int j = a.length-1; j >=0; j--) {
//                    System.out.print(a[i][j]+" ");
//                }
//            }
//            System.out.println();
//        }

    }
}

