import java.util.stream.IntStream;

public class BeforeJava8 {

    public static void main(String[] args) {
        int total = 0;
        for(int i=0;i<=50;i++){
            total +=i;
        }
        System.out.println(total);

        //After java 8
        int total1 = IntStream.rangeClosed(0,50).map(Integer :: new).sum();  //not an error
        System.out.println(total1);
    }
}
