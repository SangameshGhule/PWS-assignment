import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class Example2RemoveNull {

    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>(Arrays.asList("mayank",null,"nagraj","naveed",null,"alok"));
        ArrayList<String> names1= new ArrayList<>();
        Predicate<String> p = Objects::nonNull;

        names.stream().filter(Objects::nonNull).sorted().forEach(System.out::println);
        System.out.println();
        names.forEach(
                a-> {
                    if(p.test(a)){
                        System.out.println(a);
                        names1.add(a);
                    };
                }
        );
        System.out.println(names1);

    }
}
