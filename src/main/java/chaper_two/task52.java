package chaper_two;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

import static chaper_two.task51.User.getBuilder;

/**
 * Написать программу, которая предотвращает появление плохих данных в немутируемых объектах
 */

public class task52 {
    public static void main(String[] args) {
        Man user;
        Validator validator
                = Validation.buildDefaultValidatorFactory().getValidator();
        Man.UserBuilder userBuilder
                = new Man.UserBuilder("monika", "klooi0988")
                .email("monika@gmail.com")
                .description("M").surname("Gunther");
        final Set<ConstraintViolation<Man.UserBuilder>> violations
                = validator.validate(userBuilder);
        if (violations.isEmpty()) {
            user = userBuilder.build();
            System.out.println("User успешно создан на: " + user);
        } else {
            System.out.println("Нарушения UserBuilder: " + violations);
        }
    }

    public static final class Man {
        @NotBlank
        @Size(min = 2, max = 30)
        private final String name;
        @NotBlank
        @Size(min = 2, max = 30)
        private final String surname;
        @NotBlank
        @Size(min = 2, max = 30)
        private final String password;
        @Email
        private final String email;
        @NotBlank
        @Size(min = 2, max = 300)
        private final String description;
        @NotNull
        private final Date registration;

        public Man(Man.UserBuilder userBuilder) {
            this.name = userBuilder.name;
            this.surname = userBuilder.surname;
            this.password = userBuilder.password;
            this.email = userBuilder.email;
            this.description = userBuilder.description;
            this.registration = userBuilder.registration;
        }


        public static Man.UserBuilder getBuilder(String name, String password) {
            return new Man.UserBuilder(name, password);
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
            @NotBlank
            @Size(min = 2, max = 30)
            private final String name;
            @NotBlank
            @Size(min = 2, max = 30)
            private String surname;
            @NotBlank
            @Size(min = 2, max = 30)
            private final String password;
            @Email
            private String email;
            @NotBlank
            @Size(min = 2, max = 300)
            private String description;
            @NotNull
            private final Date registration;

            public UserBuilder(String name, String password) {
                this.name = name;
                this.password = password;
                this.registration = new Date();
            }

            public Man.UserBuilder surname(String surname) {
                this.surname = surname;
                return this;
            }

            public Man.UserBuilder email(String email) {
                this.email = email;
                return this;
            }

            public Man.UserBuilder description(String description) {
                this.description = description;
                return this;
            }

            public Man build() {
                return new Man(this);
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
