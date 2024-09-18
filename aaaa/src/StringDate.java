import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class StringDate {
    public static void main(String[] args) {

        LocalDateTime a ;

        LocalDateTime utc = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println(utc);


        System.out.println();
    }
}
