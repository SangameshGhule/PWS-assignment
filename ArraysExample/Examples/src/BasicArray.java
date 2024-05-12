import java.util.Arrays;
import java.util.OptionalInt;

public class BasicArray {
    public static void main(String[] args) {

        int i =10;
        int j =20;
        int[] pair = new int[]{i, j};
        System.out.println(pair.length);
        for(int a:pair){
            System.out.println(a);
        }


        int a[] = new int[]{4,2,2,4,3};
        System.out.println(Arrays.toString(a));

        OptionalInt max = Arrays.stream(a).max();
        System.out.println(max.getAsInt());

    }
}
