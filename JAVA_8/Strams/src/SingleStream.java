import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SingleStream {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
//        s1.forEach( p -> System.out.print(p+" "));
        s1.forEach(System.out::println);

    }
}
