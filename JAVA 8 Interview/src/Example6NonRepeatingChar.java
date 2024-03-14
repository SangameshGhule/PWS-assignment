import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example6NonRepeatingChar {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        LinkedHashMap<Integer, Long> collect = input.chars().boxed().collect(Collectors.groupingBy(a -> a, LinkedHashMap::new,Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> first = collect.entrySet().stream().filter(a -> a.getValue() == 1).findFirst();
        char c = (char)first.get().getKey().hashCode();
        System.out.println(c);

        //first repeating
        Optional<Map.Entry<Integer, Long>> first1 = input.chars().boxed().collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1).findFirst();
        System.out.println((char)first1.get().getKey().hashCode());

        //second repeating
        Optional<Map.Entry<Integer, Long>> first2 = input.chars().boxed().collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1).toList().stream().skip(1).findFirst();
        System.out.println((char)first2.get().getKey().hashCode());


    }
}
