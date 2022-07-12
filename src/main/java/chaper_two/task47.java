package chaper_two;

/**
 * Объяснить и проиллюстрировать, что
 * такое немутируемый объект в среде Java
 */

public class task47 {
    /**
     * Immutable объекты(с англ. "неизменяемый") - это объект, который не позволяет изменять свои параметры.
     * А если Вы все-же пытаетесь что-то изменить, то получаете новый объект. Но старый останется прежним.
     */

    public static void main(String[] args) {
        ImmutableCat first = new ImmutableCat("Bengal", "green");

        ImmutableCat second = first.setBreed("Sphynx");
    }

    public static final class ImmutableCat {
        private String breed;
        private String eyeColor;

        public ImmutableCat(String breed, String eyeColor) {
            this.breed = breed;
            this.eyeColor = eyeColor;
            System.out.println("New cat created! It is " + this.breed + " and has " + this.eyeColor + " eyes!");
        }

        public ImmutableCat setBreed(String breed) {
            ImmutableCat c = new ImmutableCat(breed, this.eyeColor);
            return c;
        }

        public ImmutableCat setEyeColor(String eyeColor) {
            ImmutableCat c = new ImmutableCat(this.breed, eyeColor);
            return c;
        }
    }
}
