import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UTCTIME {

    public static void main(String[] args) {
        String readyAt = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        String closedAt = LocalTime.now().plusMinutes(30).format(DateTimeFormatter.ofPattern("HH:mm"));

        String collectionDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(collectionDate);
        System.out.println(readyAt);
        System.out.println(closedAt);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());


        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm");

        String formattedDateTime = utcDateTime.format(formatter);
        String formattedDateTime1 = utcDateTime.format(formatter1);


        System.out.println(formattedDateTime);
        System.out.println(formattedDateTime1);
    }
}
