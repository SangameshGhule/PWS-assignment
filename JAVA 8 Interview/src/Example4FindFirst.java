import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4FindFirst {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,8,15,8,49,15,98,32,8);
        myList.stream().findFirst().ifPresent(System.out::println);

        myList.stream().filter(a->a>30).findFirst().ifPresent(System.out::println);


    }
}
