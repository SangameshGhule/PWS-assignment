package ArrayAssignment;

//Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
public class Example9 {

    public static void main(String[] args) {

        int[] a = {2, 3, 4, 5, 6, 7, 8};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                evenSum = evenSum + a[i];
            } else
                oddSum = oddSum + a[i];
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println("Difference between even and odd sum : " + (evenSum - oddSum));
    }
}
