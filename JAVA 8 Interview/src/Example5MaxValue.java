import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example5MaxValue {

    public static void main(String[] args) {
        //Max value
        List<Integer> myList = Arrays.asList(10,8,15,8,49,15,98,32,8,98,50);
        int max = myList.stream().max(Integer::compare).get();
        System.out.println(myList.stream().max(Integer::compare).get());

        Optional<Integer> secondMax = myList.stream().filter(a -> a != max).sorted(Comparator.reverseOrder()).max(Integer::compare);
        System.out.println(secondMax.get());

        List<Integer> myList1 = Arrays.asList(10,10,20,20,30);
        //SecondMAx
        Integer i = myList1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(i);

    }
}
