/*
 * Lecture 3 – Constructors (slides_003/main.typ:570)
 * Demo: A constructor initializes a new object. It has the class name and *no return type*.
 */
package lecture03;

public class Ex18_Constructor {

    static class Student {
        String name;

        void setName(String name) {
            this.name = name;
        }
        Student(String name) {
            setName(name);
        }

        Student(String name, boolean is_amazing) {
            this(name);
            if (is_amazing) {
                this.name = "Amazing";
            }
            }
        }

    public static void main(String[] args) {
        Student lena = new Student("Lena", false);
        System.out.println(lena.name);
    }
}
