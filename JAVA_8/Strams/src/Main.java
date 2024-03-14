import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,6,4,8));
        Integer i = integers.stream().filter(a -> a == 2).findFirst().get();
        System.out.println(i+" "+integers.set(i,100));
        System.out.println(integers);

        UnaryOperator<Integer> u = a->a+5;
        Stream<Integer> iterate = Stream.iterate(0, u).limit(10);
        iterate.forEach(System.out::println);

        int sum3 = IntStream.rangeClosed(1, 5).sum();
        System.out.println(sum3+"  *");


        //Getting duplicate values
        Map<Object, Long> collect = integers.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(collect);
        List<Object> collect1 = collect.entrySet().stream().filter(a -> a.getValue() > 1).map(Map.Entry::getKey).toList();
        collect1.forEach(System.out::println);

        //Getting distinvt values
        List<Integer> collect2 = integers.stream().distinct().toList();
        System.out.println(collect2);

        //Getting values greater then 5
        integers.stream().filter(a->a>5).forEach(System.out::println);

        //all element multiply with 2
        int[] array = integers.stream().mapToInt(a -> a * 2).toArray();
        System.out.println(Arrays.toString(array));

        int sum = integers.stream().mapToInt(a -> a).sum();
        Integer sum1 = integers.stream().reduce(0, (a, b) -> a + b);
        Integer sum2 = integers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);


    }
}