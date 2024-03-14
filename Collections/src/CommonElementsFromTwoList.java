import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoList {

    //    n = 5
//    v1[] = {3, 4, 2, 2, 4}
//    m = 4
//    v2[] = {3, 2, 2, 7}
    public static void main(String[] args) {

        int v1[] = {4,5,7};
        int v2[] = {6,8,7,5};

        //Your code here
        Arrays.sort(v1); //4,5,7
        Arrays.sort(v2); //5,6,7,8
        int n = v1.length;
        int m = v2.length;
        int i =0, j =0;
        ArrayList<Integer> res = new ArrayList<>();

        while(i<n && j<m){
            if(v1[i]==v2[j]){
                res.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] > v2[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(res);
    }

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(v1).boxed().toArray(Integer[]::new)));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(Arrays.stream(v2).boxed().toArray(Integer[]::new)));
//        list.retainAll(list2);
//
//        // Convert set to list and sort
//        List<Integer> result = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//        ArrayList<Integer> list= new ArrayList<>();
//        for(int i=0;i<v1.length;i++){
//            for(int j=0;j<v2.length;j++){
//                if(v1[i]==v2[j]){
//                    list.add(v1[i]);
//                    break;
//                }
//            }
//        }
//        list.stream().sorted();
}
