import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SingleStreamObject {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,6,4));
        integers.stream().map(a->a.compareTo(a)).collect(Collectors.toList());


        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Sang-mesh", 150, 45000.0, "gsang@gmail.com", new ArrayList<>(Arrays.asList("cricket", "badminton", "movies"))));
        personArrayList.add(new Person("John", 25, 60000.0, "john@example.com", new ArrayList<>(Arrays.asList("reading", "running"))));
        personArrayList.add(new Person("Alice", 30, 75000.0, "alice@example.com", new ArrayList<>(Arrays.asList("swimming", "traveling"))));
        personArrayList.add(new Person("Bob", 22, 50000.0, "bob@example.com", new ArrayList<>(Arrays.asList("gaming", "photography"))));
        personArrayList.add(new Person("Eva", 28, 80000.0, "eva@example.com", new ArrayList<>(Arrays.asList("hiking", "cooking"))));
        personArrayList.add(new Person("Mike", 35, 90000.0, "mike@example.com", new ArrayList<>(Arrays.asList("coding", "music"))));
        personArrayList.add(new Person("Sophie", 27, 70000.0, "sophie@example.com", new ArrayList<>(Arrays.asList("painting", "yoga"))));

        personArrayList.forEach(System.out::print);
        personArrayList.forEach(a->System.out.println(a+" ,"));

        List<String> collect = personArrayList.stream().map(a -> a.name +" : "+ a.salary).collect(Collectors.toList());
        System.out.println(collect);

        Predicate<Person> pre = (p)-> p.height>=30;
        personArrayList.stream().filter(pre).toList().forEach(System.out::println);
        personArrayList.stream().filter(pre).toList().forEach(System.out::println);
        personArrayList.stream().filter(a->a.height>=30).filter(a->a.salary>46000).forEach(System.out::println);
        personArrayList.stream().filter(a -> a.height >= 30 && a.salary > 46000).forEach(System.out::println);
        Map<String, List<String>> collect1 = personArrayList.stream().filter(a -> a.height >= 30).filter(a -> a.salary > 46000).collect(Collectors.toMap(person -> person.name, person -> person.hobbies));
        collect1.forEach((s, x) -> System.out.println(s+" ->"+ x));
        personArrayList.stream().map(a->a.hobbies).forEach(System.out::println);
        personArrayList.stream().map(a->a.name.toUpperCase()).forEach(System.out::println);
        personArrayList.stream().filter(a->a.name.startsWith("S")).forEach(System.out::println);
    }
}
