import java.util.Map;
import java.util.stream.Stream;

public class LinkedHashMap {

    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer,String> list = new java.util.LinkedHashMap<>();
        list.put(1,"sangamesh");
        list.put(4,"mayank");
        list.put(3,"amar");

        list.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())). forEach(System.out::println);
        System.out.println();
        list.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println();
        list.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + "="+ entry.getValue()));
        System.out.println();
        list.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
