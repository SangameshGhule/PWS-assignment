import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListToMap {
    static int i=1;
    public static void main(String[] args) {

//        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,6));
//        Map<Integer,Integer> map = new HashMap<>();
//        integerList.forEach((a)->{
//            map.put(i,a);
//            i++;
//        });
//        System.out.println(map);

        //OR

        List<Integer> integerList = Arrays.asList(2, 1, 2, 3, 4, 5, 6);
        Map<Integer, Integer> map = IntStream.range(0, integerList.size())
                .boxed()
                .collect(Collectors.toMap(i -> i + 1, integerList::get));
        System.out.println(map);
    }
}
