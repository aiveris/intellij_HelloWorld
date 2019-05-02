import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.time.LocalDateTime;

public class TimeZoneDateTime {
    public static void main(String[] args) {

        // initialize some zone related variables
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");


        ZoneId laZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime laZonedDateTime = ZonedDateTime.of(LocalDateTime.now(), laZone);

        // let's inspect them
        System.out.println("LA: " + laZonedDateTime);
        System.out.println("Paris: " + zonedDateTime);


        System.out.println("ZoneId for Paris: " + zoneId);
        System.out.println(allZoneIds.size());
        for (String zone : allZoneIds){
            // System.out.println(zone);
        }
    }
}