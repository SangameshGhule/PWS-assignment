package ArrayAssignment;

//Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.
public class Example10 {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 4, 2, 3, 4, 5, 5, 5};
        int[] r = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            if (i % 2 == 0) {
                r[i] = a[i] + 10;
            } else
                r[i] = a[i] * 2;
        }
        for (int j : r) {
            System.out.println(j);
        }
    }
}
