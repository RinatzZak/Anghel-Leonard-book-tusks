package chaper_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Написать программу, которая выполняет проверку на null и выбрасывает исключение NullPointerException с персонализованными сообщениями
 */

public class task41 {
    public static List<String> strings = new ArrayList<>();
    public static List<String> stringList = new ArrayList<>();

    static {
        strings.add("Hello");
        strings.add("world!");
    }

    public static void main(String[] args) {

        System.out.println(checkForNull(strings));
        System.out.println(checkForNull(stringList));
    }

    public static List checkForNull(List<String> strings) {
        if (strings != null && !strings.isEmpty()) {
            return strings;
        } else {
            throw new NullPointerException("List is null");
        }
    }
}
