package chaper_two;

/**
 * . Написать программу, представляющую немутируемый
 * класс.
 */

public class task49 {

    public static final class Cat {
        private final String name;
        private final int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
