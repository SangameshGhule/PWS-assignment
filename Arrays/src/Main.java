import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
            // Creating an ArrayList of integers
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(3);
            numbers.add(8);
            numbers.add(1);
            numbers.add(6);


        Collections.reverse(numbers);

        // Printing the reversed ArrayList
        System.out.println("Reversed numbers: " + numbers);
        }
    }
