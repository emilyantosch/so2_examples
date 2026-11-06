/*
 * Lecture 3 – Access to Object Variables (slides_003/main.typ:148)
 * Question: What will this print?
 */
package lecture03;

public class Ex04_FieldAccess {

    static class Student {
        String name;
        int matrNumber;
        int enrolledYear;
    }

    public static void main(String[] args) {
        Student lena = new Student();
        System.out.println("Enrolled: " + lena.enrolledYear);
        lena.name = "Lena";
        lena.matrNumber = 591753;
        lena.enrolledYear = 2012;
        System.out.println("Enrolled: " + lena.enrolledYear);
    }
}

// Answer:
// Enrolled: 0
// Enrolled: 2012
// Fields get default values (int -> 0), unlike local variables.
