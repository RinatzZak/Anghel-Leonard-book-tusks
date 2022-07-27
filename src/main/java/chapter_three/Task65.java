package chapter_three;

import java.time.LocalDateTime;

/**
 * Написать программу, которая прибавляет (и вычитает) количество времени (например, годы, дни или
 * минуты) к объекту даты-времени (например, прибавляет час к дате, вычитает 2
 * ДНЯ ИЗ LocalDateTime И Т. Д.).
 */


public class Task65 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(minusTwoDays(localDateTime));
        System.out.println(plusTwoHours(localDateTime));
    }

    public static LocalDateTime minusTwoDays(LocalDateTime localDateTime) {
        return localDateTime.minusDays(2);
    }

    public static LocalDateTime plusTwoHours(LocalDateTime localDateTime) {
        return localDateTime.plusHours(2);
    }
}
