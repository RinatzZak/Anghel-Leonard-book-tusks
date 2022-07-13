package chaper_two;

/**
 * Передача мутируемых объектов
 * в немутируемый класс
 * и возврат мутируемых объектов из него
 */

public class task50 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setName("Catty");
        AnimalAction action = new AnimalAction(cat, "Mow mow");
        System.out.println(action.getCat());
        action.getCat().setAge(3);
        System.out.println(action.getCat());

    }

    public static class Cat {
        private String name;
        private int age;

        public Cat() {
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
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

    public static final class AnimalAction {
        private final Cat cat;
        private final String action;

        public AnimalAction(Cat cat, String action) {
            this.cat = cat;
            this.action = action;
        }

        public String getAction() {
            return action;
        }

        public Cat getCat() {
            Cat clone = new Cat();
            clone.setName(this.cat.getName());
            clone.setAge(this.cat.getAge());
            return clone;
        }

        @Override
        public String toString() {
            return "AnimalAction{" +
                    "cat=" + cat +
                    ", action='" + action + '\'' +
                    '}';
        }
    }

}
