/*
 * Lecture 3 – Getters and Setters (slides_003/main.typ:341)
 * Demo: setName / getName accessor methods.
 */
package lecture03;

public class Ex10_GettersSetters {

    static class Student {
        String name;

        void setName(String value) {
            name = value;
        }

        String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Student lena = new Student();
        lena.setName("Lena");
        System.out.println(lena.getName());
    }
}
