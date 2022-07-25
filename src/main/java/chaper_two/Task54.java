package chaper_two;

/**
 * продемонстрировать способы переопределения метода toString.
 */

public class Task54 {

    public static void main(String[] args) {
        System.out.println(new Cat("Alica", 1));
        System.out.println(new Dog("Leika", 2));
    }

    public static class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Dog {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
