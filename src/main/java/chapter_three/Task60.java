package chapter_three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Написать программу, которая извлекает текущую дату без времени или даты.
 */

public class Task60 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime.truncatedTo(ChronoUnit.MINUTES));
    }
}
