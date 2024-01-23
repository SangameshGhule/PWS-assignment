import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] code = {{1, 2}, {3, 4, 5}};
        for(int[] ele:code){
            System.out.print(Arrays.toString(ele));
        }
    }
}