package ArrayAssignment;

import java.util.Scanner;

//Count the number of elements strictly greater than x.
public class Example6 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 8, 7};
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which greater than x: ");
        int num = sc.nextInt();

        for (int j : a) {
            if (num < j) {
                System.out.println(j);
                count++;
            }
        }
        System.out.println("Total higher elements from given number : " + count);

    }
}
