import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeLocalTime {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime sixThirty = LocalTime.parse("06:30");


        // LocalTime sixThirty = LocalTime.of(6, 30);
        LocalTime sevenThirty = LocalTime.parse("06:30")
                .plus(1, ChronoUnit.HOURS);

        System.out.println(sevenThirty);
        System.out.println(sevenThirty.getHour());

        int six = LocalTime.parse("06:30").getHour();
        boolean isbefore = LocalTime.parse("06:30")
                .isBefore(LocalTime.parse("07:30"));
    }
}