import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckingOnlyAlphabet {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        boolean b = s.chars().allMatch(Character::isAlphabetic);
        System.out.println(b);
    }
}
