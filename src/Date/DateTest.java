package Date;

import java.time.Instant;
import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfWeek());
    }
}
