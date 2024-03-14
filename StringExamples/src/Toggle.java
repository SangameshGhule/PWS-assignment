//Input a string of length less than 10 and convert it into integer without using builtin function.

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
    }
}

