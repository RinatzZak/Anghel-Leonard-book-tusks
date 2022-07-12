package chaper_two;

/**
 * Написать программу, которая
 * проверяет, находится ли заданный индекс между 0 (включительно) и заданной
 * длиной (исключительно). Если заданный индекс находится вне интервала [0;
 * заданной длины], ТО выбросить исключение IndexOutOfBoundsException
 */

public class task43 {
    public static int index = 30;
    public static int length = 28;

    public static void main(String[] args) {
        goodOrBadIndex(index);
    }

    public static void goodOrBadIndex(int index) {
        if (index >= 0 && index < length) {
            System.out.println("Yep, good index");
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
