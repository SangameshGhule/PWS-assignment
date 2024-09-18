import java.util.*;
import java.util.stream.Collectors;

public class StreamReduce {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,8,5,1,8));

        List<Integer> collect1 = integers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(collect1);

        boolean b1 = integers.stream().anyMatch(a -> a==5);
        boolean b2 = integers.stream().noneMatch(a -> a>5);

        System.out.println(b1);
        System.out.println(b2);

//        Integer reduce = integers.stream().reduce(0, (a, b) -> a + b);
        Integer add = integers.stream().reduce(0, Integer::min);
        Integer mul = integers.stream().reduce(1, (a,b)-> a*b);
//        Optional<Integer> max = integers.stream().reduce((a, b)-> a.compareTo(b));
//        System.out.println(max);


        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));

        List<Integer> duplicates = collect.entrySet().stream()
                 .filter(entry -> entry.getValue() > 1)
                 .map(Map.Entry::getKey)
                 .collect(Collectors.toList());
                System.out.println("Duplicate elements: " + duplicates);
    }
}

