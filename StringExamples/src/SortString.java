public class SortString {
    public static void main(String[] args) {
        // Given string
        String s = "care";
        String f = "race";
        boolean result = true;

        // Sort the character array using bubble sort
        char[] chars = bubbleSort(s.toCharArray());
        char[] chars1 = bubbleSort(f.toCharArray());

        System.out.println(chars);
        System.out.println(chars1);

        for(int i =0; i< chars.length;i++){
            if(chars[i]!= chars1[i]){
                result = false;
            }
        }

        if (result) System.out.println("anagram");
        else System.out.println("not anagram");
    }

    // Bubble sort algorithm
    public static char[] bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
