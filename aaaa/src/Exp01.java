import java.util.Arrays;

public class Exp01 {

    public static void main(String[] args) {
        int[] a = {2, 2, 4,5,-9, 2, -5, 5, 4, 1, 5};
        int temp = 0;
        int start = -1;
        int end = 0;

        for (int i = 0; i < a.length; i++) {  //1
            temp = a[i];
            for (int j = i + 1; j < a.length; j++) {  //2
                temp = temp + a[j];
                if (temp == 0) {
                    start = i;
                    end = j;
                    break;
                }
            }
            if (start != -1) break;
        }
        System.out.println(start + "," + end);
        int length = end - start + 1;

        if (start != -1 && end != 0) {
            int[] substring = new int[length];
//            System.arraycopy(a, start, substring, 0, length);
            for (int i = 0; i < length; i++) {
                substring[i] = a[start + i];
            }
            System.out.println(Arrays.toString(substring));
        } else {
            System.out.println("Not found");
        }
    }
}
