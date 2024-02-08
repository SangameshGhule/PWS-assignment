package Assignment;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 9, 1};
        int n = a.length;
        printArray(a);
        System.out.println();

        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }else break;
            }
        }
        printArray(a);
    }

    private static void swap(int[] a, int i, int j) {
        int temp=0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
