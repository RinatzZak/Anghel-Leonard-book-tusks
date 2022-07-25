package chaper_two;

/**
 * Проверка ссылок на null и выбрасывание заданного исключения (например, исключения IllegalArgumentException).
 * Написать программу, которая выполняет проверки заданных ссылок на null и выбрасывает указанное исключение.
 */

public class Task42 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        if (dog.name != null) {
            System.out.println(dog);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }

        public Dog() {
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
