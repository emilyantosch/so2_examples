/*
 * Lecture 3 – Initialization (slides_003/main.typ:193, 204)
 * Question: What will this print?
 */
package lecture03;

public class Ex06_FieldInitializer {

    static class Student {
        String name = "Unknown";
        int matrNumber;
        int enrolledYear = 2019;
    }

    public static void main(String[] args) {
        Student lena = new Student();
        System.out.println("Name: " + lena.name);
        System.out.println("Number: " + lena.matrNumber);
        System.out.println("Enrolled: " + lena.enrolledYear);
        lena.name = "Lena";
        System.out.println("Name: " + lena.name);
    }
}

// Answer:
// Name: Unknown
// Number: 0
// Enrolled: 2019
// Name: Lena
