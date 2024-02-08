public class Example7_01 {

    public static void main(String[] args) {
        String[] s= {"2339900","332","4453","44445","44449"};
        length(s);
    }

    private static void length(String[] s) {
        String res = " ";
        for (String string : s) {
            assert false;
            if (string.length() > res.length()) {
                res = string;
            } else if(string.length() == res.length()){
               res =comparison(s);
            }
        }
        System.out.println(res);
    }

    private static String comparison(String[] s) {
        int res= 0;
        int secRes = 0;
        for (String string : s) {
            int num = Integer.parseInt(string);
            if (num > res) {
                secRes = res;
                res = num;
            } else if (num > secRes && num < res) {
                secRes = num;
            }
        }
        return String.valueOf(res);
    }
}
