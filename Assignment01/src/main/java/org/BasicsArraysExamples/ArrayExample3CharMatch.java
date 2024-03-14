package org.BasicsArraysExamples;

public class ArrayExample3CharMatch {
    public static void main(String[] args) {
        numJewelsInStones("stones","mbjb");
    }
    public static void numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++)
            if(jewels.indexOf(stones.charAt(i)) != -1){
                count++;
            }
        System.out.println(count);
    }
}
