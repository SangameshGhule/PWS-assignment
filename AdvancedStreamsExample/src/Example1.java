import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

// Sequential stream
        Integer reduce = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, Integer::sum);
        int sum = numbers.stream().filter(a -> a % 2 == 0).mapToInt(a -> a).sum();
        int sum1 = numbers.stream().filter(a -> a % 2 == 0).mapToInt(a -> a*2).sum();
        List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());

        System.out.println(reduce);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(distinct);

        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream().filter(String::isEmpty).count();
        List<String> list = strList.stream().filter(a -> !a.isBlank()).map(String::toUpperCase).toList();
        String collect = strList.stream().filter(a -> !a.isBlank()).map(String::toUpperCase).collect(Collectors.joining(","));

        System.out.println(count);
        System.out.println(list);
        System.out.println(collect);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println(stats);

    }
}
