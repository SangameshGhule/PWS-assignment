import java.util.Arrays;
import java.util.stream.Stream;

public class BoxedArrayToStreamArray {

    public static void main(String[] args) {
        String array[] = { "Geeks", "forGeeks",
                "A Computer Portal" };

        Stream<String> stream = Arrays.stream(array);
        String string = Arrays.toString(stream.toArray());
        System.out.println(string);
    }
}
