import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2StartWith2 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> collect = myList.stream().filter(a -> a.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = myList.stream().map(s -> s + "").collect(Collectors.toList());
        System.out.println(collect1);

        myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
