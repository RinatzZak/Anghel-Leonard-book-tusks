package chapter_three;

import org.hibernate.internal.util.ZonedDateTimeComparator;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Написать программу, которая показывает все имеющиеся часовые пояса в UTC и GMT.
 */

public class Task66 {
    public static void main(String[] args) {
        Task66 display = new Task66();

        System.out.println("Time zones in UTC:");
        List utc = getTimeZoneList(
                Task66.OffsetBase.UTC);
        utc.forEach(System.out::println);

        System.out.println("Time zones in GMT:");
        List gmt = getTimeZoneList(
                Task66.OffsetBase.GMT);
        gmt.forEach(System.out::println);
    }

    public enum OffsetBase {
        UTC,
        GMT
    }

    private static String getOffset(LocalDateTime dateTime, ZoneId id) {
        return dateTime
                .atZone(id)
                .getOffset()
                .getId()
                .replace("Z", "+00:00");
    }

    public static List<String> getTimeZoneList(OffsetBase base) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        LocalDateTime now = LocalDateTime.now();
        return availableZoneIds
                .stream()
                .map(ZoneId::of)
                .sorted(new ZoneComparator())
                .map(id -> String.format("(%s%s) %s", base, getOffset(now, id), id.getId()))
                .collect(Collectors.toList());
    }

    private static class ZoneComparator implements Comparator<ZoneId> {

        @Override
        public int compare(ZoneId zoneId1, ZoneId zoneId2) {
            LocalDateTime now = LocalDateTime.now();

            ZoneOffset offset1 = now
                    .atZone(zoneId1)
                    .getOffset();

            ZoneOffset offset2 = now
                    .atZone(zoneId2)
                    .getOffset();

            return offset1.compareTo(offset2);
        }
    }
}
