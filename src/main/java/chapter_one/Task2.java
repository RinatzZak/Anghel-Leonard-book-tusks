package chapter_one;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Написать программу, которая возвращает первый неповторяющийся(некратный) символ в заданной строке.
 */

public class Task2 {
    public static String string = "aaBBddBBBh991";

    public static void main(String[] args) {
        System.out.println(NonRepeatingCharacter(string));
    }

    public static Character NonRepeatingCharacter(String s) {
        Map<Integer, Long> map = s.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return (char)(int)map.entrySet().stream()
                .filter(a -> a.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No chars for your request!"));
    }
}
