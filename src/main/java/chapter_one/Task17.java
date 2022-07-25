package chapter_one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * написать программу, которая подсчитывает число появлений заданной строки в другой строке
 */

public class Task17 {
    static String sentence = "Hello my new beautiful world! my friends are good people";

    static String someStr = "my";

    public static void main(String[] args) {
        System.out.println(countingOfStr(sentence, someStr));
    }

    public static Integer countingOfStr(String sentence, String someStr) {
        int count = 0;
        Pattern p = Pattern.compile(someStr);
        Matcher matcher = p.matcher(sentence);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
