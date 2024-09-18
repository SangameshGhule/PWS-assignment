package duplicateunique;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueElemetFromSorted {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,6,6};
        Set<Integer> integerSet = new HashSet<>();
        int n = arr.length;
        int i=0;

        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
            integerSet.add(arr[j]);
        }
        System.out.println(integerSet);
        System.out.println(i+1);
    }
}
