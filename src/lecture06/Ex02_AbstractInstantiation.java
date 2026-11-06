/*
 * Lecture 6 – Abstract Classes Cannot Be Instantiated (slides_006/main.typ:52)
 * Demo: new A() is a compile error; A valid = new B() is fine.
 */
package lecture06;

public class Ex02_AbstractInstantiation {

    public static abstract class A {
        // Shared state and behavior
    }

    public static class B extends A {
        // Concrete subclass
    }

    public static void main(String[] args) {
        // COMPILE ERROR: A is abstract; cannot be instantiated
        // A invalid = new A();
        A valid = new B();    // Concrete object, abstract reference type
        System.out.println(valid.getClass().getSimpleName());
    }
}
