package chaper_two;

import java.util.Date;

import static chaper_two.Task51.User.getBuilder;

/**
 * Написание немутируемого класса с помощью шаблона строителя
 */

public class Task51 {

    public static void main(String[] args) {

        User userl = getBuilder("marin21", "hjju9887h").build();

        User user2 = getBuilder("onik", "44fef22")
                .email("ion@gmail.com")
                .build();

        User user3 = getBuilder("monika", "klooi0988")
                .email("monika@gmail.com")
                .description("Monika")
                .surname("Ghuenter")
                .build();

        System.out.println(userl + "\n" + user2 + "\n" + user3);
    }

    public static final class User {
        private final String name;
        private final String surname;
        private final String password;
        private final String email;
        private final String description;
        private final Date registration;

        public User(UserBuilder userBuilder) {
            this.name = userBuilder.name;
            this.surname = userBuilder.surname;
            this.password = userBuilder.password;
            this.email = userBuilder.email;
            this.description = userBuilder.description;
            this.registration = userBuilder.registration;
        }

        public static UserBuilder getBuilder(String name, String password) {
            return new UserBuilder(name, password);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", description='" + description + '\'' +
                    ", registration=" + registration +
                    '}';
        }

        public static final class UserBuilder {
            private final String name;
            private String surname;
            private final String password;
            private String email;
            private String description;
            private final Date registration;

            public UserBuilder(String name, String password) {
                this.name = name;
                this.password = password;
                this.registration = new Date();
            }

            public UserBuilder surname(String surname) {
                this.surname = surname;
                return this;
            }

            public UserBuilder email(String email) {
                this.email = email;
                return this;
            }

            public UserBuilder description(String description) {
                this.description = description;
                return this;
            }

            public User build() {
                return new User(this);
            }

            public String getName() {
                return name;
            }

            public String getSurname() {
                return surname;
            }

            public String getPassword() {
                return password;
            }

            public String getEmail() {
                return email;
            }

            public String getDescription() {
                return description;
            }

            public Date getRegistration() {
                return new Date(registration.getTime());
            }
        }

    }
}
