import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 5, 6, 3));  //1,4,3,2,5,6
        List<Integer> integers1 = new ArrayList<>(Arrays.asList(1, 5, 6,4,4, 9)); //1,5,6,9
        List<Integer> integers2 = new ArrayList<>(Arrays.asList(1,4, 3, 7, 8)); //1,4,3,7,8


        List<Integer> collect = integers.stream()
                .filter(integers1::contains)
                .filter(integers2::contains)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<List<Integer>> collect1 = Stream.of(integers.stream().distinct().toList(), integers1, integers2).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> list = collect1.stream().flatMap(Collection::stream).toList();
        System.out.println(list);

        Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect2);

        List<Integer> collect3 = collect2.entrySet().stream().filter(a -> a.getValue() == 3).map(a -> a.getKey()).collect(Collectors.toList());
        System.out.println(collect3);


        List<Integer> commonValues = findCommonValues(integers, integers1, integers2);

        System.out.println("Common values: " + commonValues);
    }

    private static List<Integer> findCommonValues(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        List<Integer> commonValues = new ArrayList<>();

        // Check each element in list1
        for (Integer value : list1) {
            if (isPresentInList(value, list2) && isPresentInList(value, list3) && !isPresentInList(value, commonValues)) {
                commonValues.add(value);
            }
        }

        return commonValues;
    }

    private static boolean isPresentInList(Integer value, List<Integer> list) {
        for (Integer element : list) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
