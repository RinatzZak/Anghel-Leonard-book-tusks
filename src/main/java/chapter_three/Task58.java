package chapter_three;

import java.time.LocalDate;

/**
 * Написать программу, которая иллюстрирует конвертацию из строки в дату-время и обратно.
 */

public class Task58 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String strDate = date.toString();
        String date2 = "2022-10-10";
        LocalDate dateFromStr = LocalDate.parse(date2);
        System.out.println(strDate);
        System.out.println(dateFromStr);
    }
}
