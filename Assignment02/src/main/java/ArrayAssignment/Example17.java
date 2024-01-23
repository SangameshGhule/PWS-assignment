package ArrayAssignment;

//Find the first non-repeating element in the array .
public class Example17 {

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 8, 2,3};
        int result = findFirstNonRepeatingElement(array);

        if (result != -1) {
            System.out.println("First non-repeating element: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }

    static int findFirstNonRepeatingElement(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && array[i] == array[j]) {
                    break;
                }
            }
            if (j == n) {
                return array[i];
            }
        }
        return -1;
    }
}

