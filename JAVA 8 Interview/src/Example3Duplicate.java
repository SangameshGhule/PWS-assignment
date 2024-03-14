import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Example3Duplicate {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,15,8,49,15,98,32,8);
        myList.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
        System.out.println();

        //print duplicates
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

        //remove duplicates
        Set<Integer> set1 = new HashSet<>();
        List<Integer> collect = myList.stream().filter(set1::add).toList().stream().sorted().toList();
        System.out.println(collect);

        //FindFirst element duplicate
        Set<Integer> set2 = new HashSet<>();
        Optional<Integer> first = myList.stream().filter(a -> !set2.add(a)).toList().stream().findFirst();
        System.out.println(first.orElse(0));

    }
}
