package Assignment1;

import java.util.Scanner;

public class GivenStringPalindromeUsingLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name : ");
        String name= sc.next();
        char[] name1 = name.toCharArray();
        int count= 0;
        int j = name1.length-1;

        for(int i= 0; i<= name1.length-1;i++){
            if(name1[i]!=name1[j]) count++;
            j--;
        }
        if(count==0){
            System.out.println(name+ " is a Palindrome");
        }else{
            System.out.println(name+ " is not a Palindrome");
        }
    }
}
