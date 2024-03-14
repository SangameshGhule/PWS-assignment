import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ABC {
    public static ArrayList<Integer> findCommonElements(int[] V1, int[] V2) {
        // Convert arrays to sets
        ArrayList<Integer> list1 = Arrays.stream(V1).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> list2 = Arrays.stream(V2).boxed().collect(Collectors.toCollection(ArrayList::new));
        // Find common elements
        list1.retainAll(list2);
        // Sort the list
        list1.sort(null);

        return list1;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] V1 = {3, 4, 2, 2, 4};
        int[] V2 = {3, 2, 2, 7};

        // Find common elements and print the result
        List<Integer> commonElements = findCommonElements(V1, V2);
        System.out.println("Common Elements (Sorted): " + commonElements);
    }
}
