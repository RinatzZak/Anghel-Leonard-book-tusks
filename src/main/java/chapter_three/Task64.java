package chapter_three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Написать программу, которая извлекает
 * единицы даты и времени (например, извлекает из даты год, месяц, минуту и т.д.) из объекта, представляющего дату-время.
 */

public class Task64 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        int localYear = localDateTime.getYear();
        int localDay = localDateTime.toLocalDate().getDayOfMonth();
        int localMonth = localDateTime.getMonthValue();
        System.out.println(localYear);
        System.out.println(localMonth);
        System.out.println(localDay);

        int localHour = localDateTime.getHour();
        int localMinutes = localDateTime.getMinute();
        int localSeconds = localDateTime.getSecond();
        System.out.println(localHour);
        System.out.println(localMinutes);
        System.out.println(localSeconds);
    }
}
