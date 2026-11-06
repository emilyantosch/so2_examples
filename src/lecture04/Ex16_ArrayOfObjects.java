/*
 * Lecture 4 – Arrays of Objects (slides_004/main.typ:349)
 * Demo: An array of references to Person objects.
 */
package lecture04;

public class Ex16_ArrayOfObjects {

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
        Person[] friends = new Person[3];
        System.out.println(friends[0]); // null before assignment

        friends[0] = new Person("Lena", "Jensen");
        friends[1] = new Person("Birgit", "Meyer");
        friends[2] = new Person("Jan", "Schmidt");

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
    }
}

// Output:
// null
// Lena Jensen
// Birgit Meyer
// Jan Schmidt
