import java.util.Comparator;

public class Example2 implements Comparator<Example> {

//    //we can use compare to also
//    @Override
//    public int compare(Example e1, Example e2) {
//        return e1.getName().compareTo(e2.getName());
//    }

    //we can use compare method also
    @Override
    public int compare(Example e3, Example e4) {
        return Double.compare(e3.salary,e4.salary);
    }
}
