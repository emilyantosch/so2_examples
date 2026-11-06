/*
 * Lecture 4 – The `toString()` Method (slides_004/main.typ:133)
 * Task: Create a Person class with `toString()`. Test its implicit call in console output.
 */
package lecture04;

public class Ex05_ToString {

    static class Person {
        String firstName, surname;

        public Person(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public String toString() {
            return firstName + " " + surname;
        }
    }

    public static void main(String[] args) {
        Person lena = new Person("Lena", "Jensen");
        String name = "Name: " + lena;
        System.out.println(lena);
        System.out.println(name);
    }
}

// Output:
// Lena Jensen
// Name: Lena Jensen
// Remove toString() to see the default output, e.g. lecture04.Ex05_ToString$Person@1b6d3586
