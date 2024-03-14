import java.util.HashMap;
import java.util.Map;

public class MapExampleTogetValues {

    public static void main(String[] args) {

        int n = 4;
        String[] keys = {"csdb", "dsh", "askj", "adfs"};
        int[] values = {4, 5, 8, 9};
        Map<String,Integer> mp = new HashMap<>();
        int res=-1;

        for(int i=0;i<n;i++){
            mp.put(keys[i],values[i]);
        }
        System.out.println(mp);

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("adfs")) {
                res= entry.getValue();
            }
        }
        System.out.println(res);

//        mp.forEach((key, value) -> {
//            if (key.equalsIgnoreCase("askj")) {
//                System.out.println(value);
//            }
//        });
    }
}
