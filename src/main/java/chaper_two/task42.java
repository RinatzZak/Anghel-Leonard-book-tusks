package chaper_two;

/**
 * Написать программу, которая выполняет проверки заданной ссылки на
 * null, и если она не является null, то возвращает ее; в противном случае возвращает непустую ссылку по умолчанию
 */

public class task42 {
    public static void main(String[] args) {
        Cat cat = new Cat("Alice", "Mow mow");
        Cat cat1 = new Cat();
        cat.callCat(cat);
        cat1.callCat(cat1);
    }

    public static class Cat{
        String name;
        String action;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Cat(String name, String action) {
            this.name = name;
            this.action = action;
        }

        public Cat() {
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", action='" + action + '\'' +
                    '}';
        }

        public void callCat(Cat cat) {
            if (cat != null) {
                System.out.println(cat);
            } else {
                System.out.println("No cats");
            }
        }
    }
}
