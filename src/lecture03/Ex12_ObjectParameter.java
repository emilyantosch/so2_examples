/*
 * Lecture 3 – Methods: Objects as Parameters (slides_003/main.typ:384)
 * Demo: The reference is copied; the object is *not* copied.
 */
package lecture03;

public class Ex12_ObjectParameter {

    static class Student {
        String name;
    }

    static void setNameBirgit(Student student) {
        student.name = "Birgit";
        System.out.println(student.name);
    }

    // Slide 429: Reassigning `student` would not reassign `lena`.
    static void reassign(Student student) {
        student = new Student();
        student.name = "Kai";
    }

    public static void main(String[] args) {
        Student lena = new Student();
        lena.name = "Lena";
        setNameBirgit(lena);
        System.out.println(lena.name);

        reassign(lena);
        System.out.println(lena.name);
    }
}

// Output:
// Birgit
// Birgit
// Birgit   (reassign() only changed its own copy of the reference)
