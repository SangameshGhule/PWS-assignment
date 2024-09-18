import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

public class Exmpale8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("Red", "Blue","Greenn")),
                new Person("Bob", Arrays.asList("Green", "Yellow","Redd")),
                new Person("Charlie", List.of("Purple","Yelloww"))
        );

        List<List<String>> list = people.stream().map(Person::getFavoriteColors).toList();
        System.out.println(list);
        List<String> collect = people.stream().flatMap(a -> a.getFavoriteColors().stream()).collect(Collectors.toList());
        System.out.println(collect);

        List<String> y = people.stream().flatMap(a -> a.getFavoriteColors().stream()).filter(b -> b.startsWith("B")).collect(Collectors.toList());
        System.out.println(y);
    }
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
class Person {
    private String name;
    private List<String> favoriteColors;
}
