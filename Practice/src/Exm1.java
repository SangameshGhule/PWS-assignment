import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exm1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().sorted(Comparator.reverseOrder());

        List<Integer> collect = numbers.stream().filter(a -> a > 5 && a % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);
    }
}
