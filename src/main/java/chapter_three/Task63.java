package chapter_three;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

/**
 * Объяснить и привести пример использования API Period И Duration.
 */

public class Task63 {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.now(), LocalDate.of(2022, 1, 26));
        System.out.println(period);

        Instant start = Instant.parse("2022-10-03T10:15:30.00Z");
        Instant end = Instant.parse("2021-10-03T10:16:30.00Z");
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toDays());
    }
}
