//Given a sentence ‘str’, return the word that is lexicographically maximum.

public class Example10 {
    public static void main(String[] args) {
        String a = "car";
        String b = "ghj";

        char[] ch = new char[128];
        char[] ch1 = new char[128];
        boolean bln = true;

        for (int i = 0; i < a.length(); i++) {
            char a1 = a.charAt(i);
            char a2 = b.charAt(i);
            int ind = (int) a1;

            if (ch[ind] == '\0') ch[ind] = a2;
            else if (ch[ind] != a2) bln = false;
        }

        for (int i = 0; i < b.length(); i++) {
            char a1 = b.charAt(i);
            char a2 = a.charAt(i);
            int indx = (int) a2;
            if (ch1[indx] == '\0') ch1[indx] = a1;
            else if (ch[indx] != a1) bln = false;
        }
        System.out.println(bln);
    }
}
