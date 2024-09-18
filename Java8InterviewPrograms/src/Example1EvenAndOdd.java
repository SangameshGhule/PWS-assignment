import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1EvenAndOdd {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87,56,21);

        //even
        listOfIntegers.stream().distinct().filter(a->a%2==0).forEach(System.out::println);
        //odd
        listOfIntegers.stream().distinct().filter(a->a%2!=0).forEach(System.out::println);

        //sum  & max
        System.out.println(listOfIntegers.stream().reduce(Integer::sum).get());
        System.out.println(listOfIntegers.stream().reduce(Integer::max).get());
        System.out.println(listOfIntegers.stream().reduce(Integer::min).get());

        //distinct for unique values
        //to print what all are duplicate?
        Map<Integer, Long>  mapCollection = listOfIntegers.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        //duplicate
        mapCollection.entrySet().stream().filter(a -> a.getValue() > 1).map(Map.Entry::getKey).toList().forEach(System.out::println);
        //without duplicate
        mapCollection.entrySet().stream().filter(a -> a.getValue() <= 2).map(Map.Entry::getKey).toList().forEach(System.out::println);


        List<String> stationeryList = Arrays.asList("pen", "eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect = stationeryList.stream().filter(a -> a.startsWith("P") || a.startsWith("p")).collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
        collect.keySet().forEach(System.out::println);

        for(String a: stationeryList){
            int i = 0;
            if((int)a.charAt(0) >=97) {
                if ((int) a.charAt(0) >= 97) {
                    int asciiValue = (int) a.charAt(0) - 32;
                    char newChar = (char) asciiValue;
                    a = newChar + a.substring(1); // Replacing first character with uppercase version
                    stationeryList.set(i, a);
                }
            }
            i++;
        }
        stationeryList.forEach(System.out::print);


        //reverse order
        {
            List<Double> decimalList = Arrays.asList(33.55, 12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
            System.out.println(decimalList.hashCode());
            System.out.println("--");

            decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
            Collections.reverse(decimalList);
            System.out.println(decimalList.hashCode());
        }


        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(array));

    }
}

