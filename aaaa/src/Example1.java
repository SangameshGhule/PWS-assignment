public class Example1 {
    public static void main(String[] args) {

        String a ="Sangamesh";
        char[] charArray = a.toCharArray();
        int left=0;
        int right = charArray.length-1;
        char temp;
        while(left < right){
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            right--;
            left++;
        }
        System.out.println(charArray);
    }
}
