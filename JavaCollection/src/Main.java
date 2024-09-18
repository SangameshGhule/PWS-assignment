//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Integer[] array = {10, 20, 10, 30, 50, 20, 60, 20, 20, 20, 70, 80, 20, 90};
//        List<Integer> integers = new ArrayList<>(Arrays.asList(array));
//
//        // Step 1: Find the element that occurred the most number of times
//        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
//        System.out.println(collect);
//
//        //no duplicate elements to be printed
//        collect.forEach((key, value) -> {
//            if (value <= 1) System.out.print(key+" ");
//        });
//
//        collect.entrySet().forEach(a -> {
//            if (a.getValue() >= 2) System.out.println(a.getKey());});
//
//        //or using Map.forEach()
//        System.out.println();
//        collect.forEach((key, value) -> {
//            if (value >= 2) System.out.println(key);
//        });
//
//        //if i want distinct elements
//        List<Integer> list = integers.stream().distinct().toList();
//        System.out.println(list);
//
//        //reverseOrder
//        List<Integer> collect1 = integers.stream().distinct().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(collect1);
//
//        //lowest salary
//        List<Integer> list2 = list.stream().limit(1).toList();
//        System.out.println(list2);
//
//        //Highest salary
//        Optional<Integer> max = collect1.stream().max(Comparator.comparing(a -> a));
//        System.out.println(max.get());
//
//        //or
//        List<Integer> list3 = collect1.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).toList();
//        System.out.println(list3);
//
//        //3rd highest number
//        List<Integer> list1 = collect1.stream().limit(3).skip(2).toList();
//        System.out.println(list1);
//
//        //sum
//        Integer i = integers.stream().distinct().reduce(Integer::sum).get();
//        System.out.println(i);
//
////        List<Integer> result = Arrays.stream(array)
////                .filter(e -> !(e == mostCommonElement || e == mostCommonElement - 1 || e == mostCommonElement + 1))
////                .collect(Collectors.toList());
//
//        List<Double> list4 = integers.stream().map(Integer::doubleValue).toList();
//        System.out.println(list4);
//
//        Optional<Integer> first = integers.stream().findFirst();
//        System.out.println(first.get());
//
//
//
//    }
//}


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Creating an iterator to iterate over the list
        Iterator<String> iterator = list.iterator();

        // Iterating over the list using the iterator
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            if (s.equals("B")) {
                // Attempting to modify the list while iterating
                list.remove(s); // This will throw ConcurrentModificationException
            }
        }
    }
}
