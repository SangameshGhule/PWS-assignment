import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        // Create an HttpClient instance
        HttpClient httpClient = HttpClient.newHttpClient();

        // Define the URL you want to send the request to
        String url = "https://example.com/api";

        // Define the content of the form data
        String formData = "username=johndoe&password=secret";

        // Create an HttpRequest object with the POST method and form data in the request body
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(formData))
                .build();

        // Send the request and handle the response
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        // Access the response status code and body
        int statusCode = response.statusCode();
        String responseBody = response.body();

        // Print the response status code and body
        System.out.println("Response status code: " + statusCode);
        System.out.println("Response body: " + responseBody);
    }
}
