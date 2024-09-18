import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SequesntialParaller {
        public static void main(String[] args) {
            // Create a list of numbers
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 1000000; i++) {
                numbers.add(i);
            }

            // Calculate squares using sequential stream
            long startTimeSeq = System.currentTimeMillis();
            List<Integer> squaresSequential = numbers.stream()
                    .map(n -> n * n)
                    .toList();
            long endTimeSeq = System.currentTimeMillis();
            long durationSeq = endTimeSeq - startTimeSeq;
            System.out.println("Sequential stream took: " + durationSeq + "ms");

            // Calculate squares using parallel stream
            long startTimeParallel = System.currentTimeMillis();
            List<Integer> squaresParallel = numbers.parallelStream()
                    .map(n -> n * n)
                    .toList();
            long endTimeParallel = System.currentTimeMillis();
            long durationParallel = endTimeParallel - startTimeParallel;
            System.out.println("Parallel stream took: " + durationParallel + "ms");
        }
    }
