package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая конкатенирует одну и ту же строку заданное число раз
 */

public class task20 {

    public static void main(String[] args) {
        try {
            System.out.println("введи строку");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            reader.close();
            System.out.println("Введите число, сколько раз надо конкатенировать строку");
            int count = Integer.parseInt(reader.readLine());
            System.out.println(concatenate(str, count));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String concatenate(String str, int count) {
        return str.repeat(count);
        // return String.join("", Collections.nCopies(count, str));
    }
}
