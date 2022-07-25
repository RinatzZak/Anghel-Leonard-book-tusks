package chaper_two;

/**
 * Написать программу, которая проверяет, чтобы заданный подынтервал [заданное начало; заданный
 * конец] находился внутри интервала [0; заданная длина]. Если заданный подынтервал
 * отсутствует внутри интервала [0; заданная длина], то выбросить исключение IndexOutOfBoundsException.
 */

public class Task45 {
    public static int firstIndex = 5;
    public static int lastIndex = 10;
    public static int length = 9;

    public static void main(String[] args) {
        if (firstIndex >=0 && lastIndex <= length) {
            System.out.println("Yep, good index");
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
