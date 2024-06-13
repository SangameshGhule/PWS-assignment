public class AnagramCheck {
    public static void main(String[] args) {
        String a = "race";
        String b = "care";

        boolean result = areAnagrams(a, b);
        System.out.println("Are the strings anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Sort the characters of both strings
        char[] sortedStr1 = sortString(str1);
        char[] sortedStr2 = sortString(str2);

        // Step 3: Compare sorted strings
        for (int i = 0; i < sortedStr1.length; i++) {
            if (sortedStr1[i] != sortedStr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static char[] sortString(String s) {
        char[] charArray = s.toCharArray();
        quickSort(charArray, 0, charArray.length - 1);
        return charArray;
    }

    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
