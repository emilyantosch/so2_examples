/*
 * Lecture 1 – Data encapsulation (slides_001/main.typ:231, 238, 244)
 * Demo: UML class diagram for Person. Methods control access to an object's attributes.
 *       Methods can check values before changing an attribute.
 */
package lecture01;

public class Ex02_PersonEncapsulation {

    static class Person {
        private String firstName;
        private String surname;

        public String getFirstName() {
            return firstName;
        }

        public String getSurname() {
            return surname;
        }

        public void setFirstName(String firstName) {
            if (firstName == null || firstName.isBlank()) {
                System.out.println("Rejected invalid first name");
                return;
            }
            this.firstName = firstName;
        }

        public void setSurname(String surname) {
            if (surname == null || surname.isBlank()) {
                System.out.println("Rejected invalid surname");
                return;
            }
            this.surname = surname;
        }
    }

    public static void main(String[] args) {
        Person ines = new Person();
        ines.setFirstName("Ines");
        ines.setSurname("Meyer");
        System.out.println(ines.getFirstName() + " " + ines.getSurname());

        ines.setSurname("");  // the setter protects the state
        System.out.println(ines.getFirstName() + " " + ines.getSurname());

        // COMPILE ERROR (only from another top-level class): firstName has private access in Person
        // ines.firstName = "";
    }
}

// Question (slides_001/main.typ:253): How does this differ from a struct in C?
// Answer: - Direct field access requires the struct definition to be visible.
//         - A public struct does not protect its data.
//         - The data and the functions are not combined into a class.
