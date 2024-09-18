import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        try {
            for (String s : list) {
                if (s.equals("B")) {
                    list.remove(s); // This should throw ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught!");
        }

        // Print the list to verify the result
        System.out.println(list);
    }
}
