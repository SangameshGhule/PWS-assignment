package ArrayAssignment;

// If an array arr contains n elements, then check if the given array is a palindrome or not .

public class Example12 {
    public static void main(String[] args) {
        int[] a = {1,2,1,3,4};
        boolean f= true;
        int j= a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[i]!=a[j]){
                f=false;
            }
            j--;
        }
        if(f)System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
}
