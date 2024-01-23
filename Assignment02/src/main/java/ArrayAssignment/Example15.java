package ArrayAssignment;

public class Example15 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 10;

        int count = countTripletsWithSum(array, x);
        System.out.println("Number of triplets with sum " + x + ": " + count);
    }

    static int countTripletsWithSum(int[] array, int x) {
        int n = array.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == x) {
                        count++;
                        System.out.println(array[i] +" "+ array[j] +" "+ array[k]);
                    }
                }
            }
        }

        return count;
    }
}

