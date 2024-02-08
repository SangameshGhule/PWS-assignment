//Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based
//        indexing.

public class Example1 {
    public static void main(String[] args) {
        String a = "Sangamesh";

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(i%2==1){
                ch = '#';
            }
            System.out.print(ch+"");
        }
    }
}
