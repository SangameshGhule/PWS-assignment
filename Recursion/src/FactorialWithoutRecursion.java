public class FactorialWithoutRecursion {
    public static void main(String[] args) {
        int a= 4;
        int res=1;
        for(int i=1;i<=a;i++){
            res= res*i;
        }
        System.out.println(res);
    }
}
