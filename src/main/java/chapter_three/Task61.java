package chapter_three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Написать Программу, которая
 * строит экземпляр класса LocalDateTime ИЗ объектов LocalDate И LocalTime. Она
 * объединяет дату И Время В ОДНОМ объекте LocalDateTime.
 */

public class Task61 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
