/*
 * Lecture 3 – No-Argument and Default Constructors (slides_003/main.typ:588, 601)
 * Demo: Explicit no-argument constructor vs. compiler-generated default constructor.
 */
package lecture03;

public class Ex19_NoArgConstructor {

    static class Student {
        String name;

        Student() {
            System.out.println("Constructor body runs, name = " + name);
        }
    }

    // No constructor written: the compiler generates the default constructor Student2().
    static class Student2 {
        String name;
    }

    public static void main(String[] args) {
        Student lena = new Student();
        Student2 jan = new Student2();
        System.out.println(jan.name);
    }
}

// Output:
// Constructor body runs, name = null
// null
