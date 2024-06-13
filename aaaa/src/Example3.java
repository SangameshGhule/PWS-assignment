public class Example3 {

    public static void main(String[] args) {
        String a = "[5+{3*2-(4%2)+98}-10]";

        char[] charArray = a.toCharArray();

        for(char c: charArray){
            System.out.println((int)c);
        }
    }

}
