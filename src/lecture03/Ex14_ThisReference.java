/*
 * Lecture 3 – The `this` Reference (slides_003/main.typ:457)
 * Demo: `this` refers to the object whose method is running.
 */
package lecture03;

public class Ex14_ThisReference {

    static class Student {
        String name;

        void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student lena = new Student();
        Student jan = new Student();
        lena.setName("Lena"); // this == lena
        jan.setName("Jan");   // this == jan
        System.out.println(lena.name);
        System.out.println(jan.name);
    }
}
