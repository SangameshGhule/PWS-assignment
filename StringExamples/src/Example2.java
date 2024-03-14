//Input a string of length n and count all the consonants in the given string.

public class Example2 {

    public static void main(String[] args) {
        String a = "mayank";
        int count = 0;

        for(int i=0;i<a.length();i++) {
            char ch = a.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
