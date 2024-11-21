package time;

import java.time.ZoneId;
import java.util.Set;

public class ZonedIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules()); // Asia/Seoul | ZoneRules[currentStandardOffset=+09:00]
        }

        ZoneId zoneId = ZoneId.systemDefault(); // 운영체제의 ZoneId
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId); // Asia/Seoul
    }
}
