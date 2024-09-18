import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example7TrueIfAnyValueAppearsTwice {
    public static void main(String[] args) {

        List<Integer> integer = Arrays.asList(2,5,3,1,7,5,4);
        int size = integer.size();
        List<Integer> list = integer.stream().distinct().toList();
        int size1 = list.size();
        System.out.println(size1 == size ? "false" : "true");
    }
}
