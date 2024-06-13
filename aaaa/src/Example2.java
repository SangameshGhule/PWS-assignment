import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(5);
        integerList.add(4);
        integerList.add(6);
        integerList.add(7);
        integerList.add(5);

        List<Integer> reversedList = IntStream.rangeClosed(1, integerList.size())
                .mapToObj(i -> integerList.get(integerList.size() - i))
                .collect(Collectors.toList());
        System.out.println(reversedList);

        integerList.stream().sorted((a,b)-> b-a).forEach(System.out::print);
        System.out.println();
        integerList.stream().sorted().distinct().forEach(System.out::print);
        System.out.println();
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);



        int[] a = {4,5,4,6,7,5};
        int start =0;
        int end = a.length-1;
        int temp =0;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

        List<Integer> resultList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (Integer num : a) {
            if (seen.add(num)) { // Add returns false if element is already present
                resultList.add(num);
            }
        }
        System.out.println(resultList);
    }
}
