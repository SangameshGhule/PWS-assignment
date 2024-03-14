import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example1EvenNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> collect = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //Reverse Number
        List<Integer> collect1 = collect.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);

        //Ascending
        List<Integer> collect2 = collect.stream().sorted().collect(Collectors.toList());
        System.out.println(collect2);

        //Greater than 25
        List<Integer> collect3 = collect.stream().filter(a->a>25).toList().stream().sorted().collect(Collectors.toList());
        System.out.println(collect3);

    }
}
