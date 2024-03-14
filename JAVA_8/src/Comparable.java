import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Comparable {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

//        al.sort((a,b)-> b.compareTo(a));

//        List<Integer> collect = al.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);


        int[] a ={3,1,6,4,8,9,0};

        Arrays.stream(a).boxed().sorted((c, b) -> Integer.compare(b, c)).mapToInt(Integer::intValue).toArray();


        int[] reversedArray = Arrays.stream(a)
                .boxed() // Convert IntStream to Stream<Integer>
                .sorted((i1, i2) -> Integer.compare(i2, i1)) // Reverse order comparator
                .mapToInt(Integer::intValue) // Convert back to IntStream
                .toArray(); // Convert to array
    }
}
