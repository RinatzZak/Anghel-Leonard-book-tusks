package chapter_three;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Объяснить и привести пример API Instant.
 */

public class Task62 {
    /**
     * java.time.Instant — это новый java.util.Date, только неизменяемый, с наносекундной точностью
     * и корректным названием. Внутри хранит Unix-time в виде двух полей: long с количеством секунд,
     * и int с количеством наносекунд внутри текущей секунды.
     * <p>
     * Значение обоих полей можно запросить напрямую, а также можно попросить посчитать более привычное
     * для старого API представление Unix-time в виде миллисекунд:
     */
    public static void main(String[] args) {
        Instant instant = Clock.systemDefaultZone().instant();

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant.toEpochMilli());

        Instant instant1 = Clock.system(ZoneId.of("Europe/Paris")).instant();
        System.out.println(instant1.toString());

        Instant instant2 = Clock.systemUTC().instant();
        System.out.println(instant2.toString());

        Instant instant3 = Clock.systemDefaultZone().instant();
        System.out.println(instant3.toString());
    }
}
