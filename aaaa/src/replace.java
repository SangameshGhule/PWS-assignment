public class replace {

    public static void main(String[] args) {
        String fileName = "234/12 - 54";
        String replacedFileName = fileName.replace('/', '-');
        System.out.println("Original file name: " + fileName);
        System.out.println("Replaced file name: " + replacedFileName);
    }
}
