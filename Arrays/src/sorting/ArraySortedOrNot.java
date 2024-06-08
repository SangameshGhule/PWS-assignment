package sorting;

public class ArraySortedOrNot {

    public static void main(String[] args) {

        int[] a = {1,4,3,2,8,5,5};
        int[] c = {1,2,3,4,5,6,7,4};

        boolean b =true;

        for(int i = 1;i < c.length; i++){
            if(c[i] < c[i-1]){
                b =false;
            }
        }
        System.out.println(b ? "sorted": "Not sorted");
    }
}
