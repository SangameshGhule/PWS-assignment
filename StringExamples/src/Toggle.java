//Input a string of length less than 10 and convert it into integer without using builtin function.

import java.util.Arrays;

public class Toggle {

    public static void main(String[] args) {

        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("SaNgAmEsH");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ((int) ch > 65 && (int) ch < 95) {
                sb.setCharAt(i, (char) ((char)(int)ch+32));
            }
            if ((int) ch > 95 && (int) ch < 122) {
                sb.setCharAt(i, (char) ((char)(int)ch-32));
            }
        }
        System.out.println(sb);
        
        
        
        String d= "Alok Kumar";
        String res = "";
        for(int i=d.length()-1;i>=0;i--) {
            res= res+ d.charAt(i);
        }
        System.out.println(res);

        String[] parts = d.split(" ");
        System.out.println(Arrays.asList(parts));
        if (parts.length == 2) {
            String result = parts[1] + " " + parts[0];
            System.out.println(result);
        } else {
            System.out.println("Input string does not have exactly two words.");
        }

        



    }
}

