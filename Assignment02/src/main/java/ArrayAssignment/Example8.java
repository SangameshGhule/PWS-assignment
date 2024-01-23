package ArrayAssignment;

//Check if the given array is sorted or not
public class Example8 {
    public static void main(String[] args) {

        int[] a= {1,2,3,4,8,6};

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                System.out.println("Arrays elements are not sorted");
            }
        }
    }
}
