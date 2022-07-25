package chapter_three;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Объяснить форматный шаблон для даты и времени.
 */

public class Task59 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.from(DateTimeFormatter.ISO_DATE.parse("2022-07-07"));
        LocalTime time = LocalTime.from(DateTimeFormatter.ISO_LOCAL_TIME.parse(LocalTime.now().toString()));
        System.out.println(date);
        System.out.println(time);
    }
}
