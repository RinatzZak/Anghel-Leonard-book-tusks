package chapter_one;

import java.math.BigInteger;

/**
 * Написать проргамму, которая конвертирует значения типа BigInteger в примитивный тип
 */

public class task33 {
    static BigInteger coolInt = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
       try {
           int needInt = coolInt.intValueExact();
           System.out.println(needInt);
       } catch (ArithmeticException e) {
           System.out.println("Слишком большое число");
       }
        long needLong = coolInt.longValueExact();
        System.out.println(needLong);
    }
}
