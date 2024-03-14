import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConModExc {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("nagar", "kadli", "ghule", "pandey"));

        //concurrentModificationException
//        try {
//            names.forEach((a) -> {
//                        if (a.equalsIgnoreCase("pandey")) {
//                            names.remove(a);
//                        }
//                    }
//            );
//            System.out.println(names);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        CopyOnWriteArrayList<String> nameList = new CopyOnWriteArrayList<>(Arrays.asList("mayank","nagaraj","samgames"));

        nameList.stream().forEach(
                (a)->{
                    if(a.equalsIgnoreCase("mayank")){
                        nameList.remove(a);
                    }
                }
        );
        System.out.println(nameList);

//
//        names.removeIf(name -> name.equalsIgnoreCase("pandey"));
//        System.out.println(names);
//
//        System.out.println(names);
    }
}
