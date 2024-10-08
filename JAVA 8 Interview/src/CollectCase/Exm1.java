package CollectCase;

import java.util.List;

public class Exm1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> skipped = numbers
                .stream()
                .skip(2)
                .toList();
        System.out.println(skipped);
        assert List.of(3, 4, 5).equals(skipped);

        List<Integer> limited = numbers
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(limited);
        limited.stream().reduce(0,Integer::sum);
        assert List.of(1, 2, 3).equals(limited);
    }
}
