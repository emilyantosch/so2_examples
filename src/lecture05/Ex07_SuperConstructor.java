/*
 * Lecture 5 – Calling the Superclass Constructor (slides_005/main.typ:248)
 * Demo: Put `super(...)` first in the constructors used in this lecture.
 */
package lecture05;

public class Ex07_SuperConstructor {

    static class A {
        double a;  // Initially 0.0
    }

    static class B extends A {
        double b;

        public B(double b) {
            super();
            this.b = b;
        }
    }

    public static void main(String[] args) {
        B obj = new B(4.2);
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
