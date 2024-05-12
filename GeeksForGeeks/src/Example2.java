public class Example2 {

    public static void main(String[] args) {
        String str = "Sangamesh";
        {
            char[] a = str.toCharArray();
            char[] b = new char[a.length];
            int j =0;
            for(int i=str.length()-1; i>=0; i--){
                b[j] = a[i];
                j++;
            }
            System.out.println(new String(b));
        }
    }
}
