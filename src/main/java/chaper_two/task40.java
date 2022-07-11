package chaper_two;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Написать программу, которая выполняет проверки заданных ссылок на null
 * в функциональном и императивном стилях программирования
 */

public class task40 {
    public static List<String> strings = new ArrayList<>();
    public static List<String> stringList = new ArrayList<>();

    static  {
        strings.add("Hello");
        strings.add("world!");
    }

    public static void main(String[] args) {
        System.out.println(checkForNull(strings));
        System.out.println(checkForNull(stringList));
    }

    public static List checkForNull(List<String> strings) {
        if (strings == null) {
            return Collections.EMPTY_LIST;
        }
        return strings.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }
}
