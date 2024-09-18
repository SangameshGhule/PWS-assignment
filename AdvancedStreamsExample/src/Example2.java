import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {

//        //After java 8
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(4, 5);
//
//        List<int[]> collect = list1.stream()
//                .flatMap(i -> list2.stream().map(j -> new int[]{i, j}))
//                .toList();
//        collect.forEach(a -> System.out.println(Arrays.toString(a)));
//        for(int[] a:collect){
//            System.out.println(Arrays.toString(a));
//        }

        //Before java 8
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<int[]> collect = new ArrayList<>();

        for (Integer i : list1) {
            for (Integer j : list2) {
                int[] pair = new int[]{i, j};
                System.out.println(Arrays.toString(pair));
//                collect.add(pair);
            }
        }

// Printing the collected pairs
//        for (int[] pair : collect) {
//            System.out.println(Arrays.toString(pair));
//        }

    }
}
