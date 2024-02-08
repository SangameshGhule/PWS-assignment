//Check whether the given string is palindrome or not.

public class Example3 {

    public static void main(String[] args) {
        String a= "mayank";
        int j = a.length()-1;
        boolean g = false;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            char ch1 = a.charAt(j);
            if(ch !=  ch1){
               g= true;
            }
            j--;
        }

        if(g){
            System.out.println("Not plaindrome");
        }else System.out.println("Palindrome");
    }
}
