import java.util.Base64;

public class GGG {

    public static void main(String[] args) {
        String data = "apuk@scentair.com: H07salX3Gk";

        // Encode the data
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());

        System.out.println("Encoded data: " + encodedData);
    }
}
