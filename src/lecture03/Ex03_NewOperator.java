/*
 * Lecture 3 – Example: `new` Operator (slides_003/main.typ:115)
 * Demo: `new Student()` creates an object. `=` stores its reference.
 */
package lecture03;

public class Ex03_NewOperator {

    static class Student {
        String name;
        int matrNumber;
        int enrolledYear;
    }

    public static void main(String[] args) {
        int count;
        Student lena, jan;
        lena = new Student();

        System.out.println(lena);            // a reference, e.g. lecture03.Ex03_NewOperator$Student@1b6d3586
        System.out.println(lena.name);       // null: fields are initialized
        System.out.println(lena.matrNumber); // 0
    }
}
