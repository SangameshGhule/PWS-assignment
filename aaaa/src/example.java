import java.util.TreeSet;

public class example {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(10);
        System.out.println(t);//[0, 10, 15]
    }
}
