import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Add entries to the Map 
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "Geeks");

        // Print the Map 
        System.out.println("Map: " + map);

//        Stream<Map.Entry<Integer, String>> stream;
        // Convert the Map to Stream
        List<String> collect = map.values().stream().distinct().toList();

        map.values().stream().distinct().toList().forEach(System.out::println);

        Map<String, Integer> result = map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (a, b) -> b));
        System.out.println(result);

    }
}
