package ArrayAssignment;

//Find the unique number in a given Array where all the elements are being repeated twice with one value
//being unique.

//{2,2,3,4,3,5,5}
public class Example11 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 9, 6, 7, 4, 3, 5, 5};
        int j = 0;
        int unique = 0;
        for (int k : a) {
            unique ^= k;
        }
        System.out.println(unique);
    }
}
