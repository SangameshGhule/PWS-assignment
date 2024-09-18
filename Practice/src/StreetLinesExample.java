import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreetLinesExample {

    public static void main(String[] args) {

        List<String> streetLines=new ArrayList<>(Arrays.asList("This is restriction from Carrier ,again. For production, " +
                "they'll need to take care of this.","they'll need to take care of this.","Carrier ,again. For production, they'll need to take","This is restriction"));

        streetLines.forEach(System.out::println);
//        streetLines.forEach(a->{
//            System.out.println(a.length());
//        });

        System.out.println("-----");
        streetLines.forEach(
                a-> {
                    if(a.length()>34){
                        String substring = a.substring(0, 34);
                        System.out.println(substring);
                        int i = substring.lastIndexOf(" ");
                        String substring1 = a.substring(i);
                        if(substring1.length()>34){
                            String substring2 = substring1.substring(0, 34);
                            System.out.println(substring2);
                            int j = substring2.lastIndexOf(" ");
                            String substring3 = substring1.substring(j);
                            System.out.println(substring3);
                        }else{
                            System.out.println(substring1);
                        }
                    }else{
                        System.out.println(a);
                    }
                }
        );
    }
}
