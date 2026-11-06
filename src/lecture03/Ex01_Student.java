/*
 * Lecture 3 – Example: Simple Class (slides_003/main.typ:72)
 * Task: Model a student with a name, student number, and enrollment year.
 */
package lecture03;

public class Ex01_Student {

    static class Student {
        String name;
        int matrNumber;
        int enrolledYear;
    }

    public static void main(String[] args) {
        Student lena = new Student();
        lena.name = "Lena";
        lena.matrNumber = 591753;
        lena.enrolledYear = 2012;

        Student jan = new Student();
        jan.name = "Jan";
        jan.matrNumber = 591754;
        jan.enrolledYear = 2013;

        System.out.println(lena.name + ", " + lena.matrNumber + ", " + lena.enrolledYear);
        System.out.println(jan.name + ", " + jan.matrNumber + ", " + jan.enrolledYear);
    }
}
