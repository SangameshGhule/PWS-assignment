package pattern.SpecialPattern;

import java.util.Scanner;

//4
//1 2 3 4 5 6 7
//1 2 3   5 6 7
//1 2       5 6
//1           5
public class NumberBridgePattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();int z=n+1;

        for(int k=1;k<=2*n-1; k++){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=n+1;j<=2*n-i;j++){
                System.out.print(j+i-1+" ");
            }
            System.out.println(" ");
        }
    }
}
