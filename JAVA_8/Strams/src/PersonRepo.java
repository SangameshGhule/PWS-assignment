import javax.swing.*;
import java.io.PrintStream;
import java.nio.file.OpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRepo {

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Sangamesh", 150, 45000.0, "gsang@gmail.com", new ArrayList<>(Arrays.asList("cricket", "badminton", "movies"))));
        personArrayList.add(new Person("John", 25, 60000.0, "john@example.com", new ArrayList<>(Arrays.asList("reading", "running"))));
        personArrayList.add(new Person("Alice", 30, 75000.0, "alice@example.com", new ArrayList<>(Arrays.asList("swimming", "traveling"))));
        personArrayList.add(new Person("Bob", 22, 50000.0, "bob@example.com", new ArrayList<>(Arrays.asList("gaming", "running"))));
        personArrayList.add(new Person("Eva", 28, 80000.0, "eva@example.com", new ArrayList<>(Arrays.asList("hiking", "cooking"))));
        personArrayList.add(new Person("Mike", 35, 90000.0, "mike@example.com", new ArrayList<>(Arrays.asList("coding", "gaming"))));
        personArrayList.add(new Person("Sophie", 150, 70000.0, "sophie@example.com", new ArrayList<>(Arrays.asList("painting", "yoga"))));

        Double v = personArrayList.stream().map(a -> a.salary).max(Comparator.comparing(a -> a)).get();
        System.out.println("Max salary"+v);

        Optional<Person> collect9 = personArrayList.stream().filter(a->a.height>100).findAny();
        System.out.println(collect9.orElse(null));

        Map<String, Long> collect4 = personArrayList.stream().flatMap(a -> a.hobbies.stream()).collect(Collectors.groupingBy(a -> a,Collectors.counting()));
        collect4.forEach((key, value) -> System.out.println(key + "  " + value));

        Optional<Person> reduce = personArrayList.stream().reduce((a, b) -> a.height < b.height ? a : b);
        System.out.println(reduce.get());

        Optional<Person> max = personArrayList.stream().max(Comparator.comparing((a) -> a.height));
        System.out.println(max.get());

        Optional<Person> collect = personArrayList.stream().min(Comparator.comparing(a -> a.height));
        System.out.println(collect.get());

        Person person = personArrayList.stream().reduce((a, b) -> a.height > b.height ? a : b).get();
        List<Person> collect1 = personArrayList.stream().filter(a -> Objects.equals(a.height, person.height)).collect(Collectors.toList());
        System.out.println(collect1);

        List<Person> collect3 = personArrayList.stream().filter(a -> Objects.equals(a.height, personArrayList.stream().map(b -> b.height).reduce(Integer::max).get())).collect(Collectors.toList());
        System.out.println(collect3.size());

        List<Integer> list = personArrayList.stream().map(a -> a.height).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);

        List<String> list1 = personArrayList.stream().filter(a -> a.hobbies.size() > 1).flatMap(b -> b.hobbies.stream()).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list1.stream().distinct().collect(Collectors.toList()));

        System.out.println();

        Map<List<String>, List<Person>> collect2 = personArrayList.stream().collect(Collectors.groupingBy(person1 -> person1.hobbies));
        System.out.println(collect2.entrySet());

        collect2.entrySet().forEach(listListEntry -> System.out.println(listListEntry.getKey() + "  :  " + listListEntry.getValue()));

        List<List<String>> collect5 = personArrayList.stream().map(a -> a.hobbies).collect(Collectors.toList());
        System.out.println(collect5);

        List<String> collect6 = collect5.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Map<String, Long> collect7 = collect6.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect7);
        collect7.forEach((key, value) -> {
            if (value >= 2) {
                System.out.print(key.concat("-"));
            }
        });

        personArrayList.stream().map(a -> a.salary).reduce(Double::sum).get();
//        System.out.println(reduce1.get());

    }
}
