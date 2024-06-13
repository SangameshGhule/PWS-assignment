package reverseInterger;

import java.util.ArrayList;
import java.util.HashSet;

public class LeetCodeReverseAndCheckUniqElement {

    public static void main(String[] args) {
        int[] a = {43, 21, 4, 89, 34};

        //Print uniq element after reverse all elements
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        HashSet<Integer> integersSet = new HashSet<>();
        for (int ele : a) {
            integerArrayList.add(ele);
            integersSet.add(ele);
            integersSet.add(reverseElement(ele));
            integerArrayList.add(reverseElement(ele));
        }
        System.out.println(integerArrayList);
        System.out.println(integersSet);

        //Return if any reverse elemet present or not
        boolean d = false;
        for (int ele : a) {
            if (ele > 10) {
                int r = reverseElement(ele);
                for (int ele1 : a) {
                    if (ele1 == r) {
                        d = true;
                        break;
                    }
                }
            }
        }
        System.out.println(d ? "reverse element present" : "reverse element not present");
    }

    private static int reverseElement(int a) {
        int r = 0;
        while (a != 0) {
            r = r * 10 + a % 10;
            a /= 10;
        }
        return r;
    }

}
