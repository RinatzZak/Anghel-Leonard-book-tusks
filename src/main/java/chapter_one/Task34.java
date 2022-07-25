package chapter_one;

/**
 * Написать программу, которая конвернтирует значение типа long в занчение типа int
 */

public class Task34 {
    static long l = Long.MAX_VALUE;

    public static void main(String[] args) {
        int i = Long.valueOf(l).intValue();
        System.out.println(i);

       try {
           int a = Math.toIntExact(l);
           System.out.println(a);
       } catch (ArithmeticException e) {
           System.out.println("ArithmeticException");
       }
    }
}
