/*
 * Lecture 3 – Assignment of References (slides_003/main.typ:229, 237)
 * Question: What will this print after `jan = lena;`?
 */
package lecture03;

public class Ex07_ReferenceAlias {

    static class Student {
        String name;
    }

    public static void main(String[] args) {
        Student lena = new Student();
        Student jan = new Student();
        System.out.println(lena == jan); // two objects

        jan = lena;
        System.out.println(lena == jan); // same object now

        lena.name = "Birgit";
        jan.name = "Kai";
        System.out.println(lena.name);
        System.out.println(jan.name);
    }
}

// Answer:
// false
// true
// Kai
// Kai
// After jan = lena both variables refer to the same object; the old jan object is garbage.
