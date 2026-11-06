/*
 * Lecture 5 – Constructor Chaining (slides_005/main.typ:243, 267)
 * Demo: First allocate all fields with default values; then run the constructor chain.
 *       At each class: field initializers, then constructor body after super().
 */
package lecture05;

public class Ex08_ConstructorChain {

    static class A {
        int a = init("A field initializer");

        A() {
            // Implicit super() to Object() runs first
            System.out.println("A() body");
        }
    }

    static class B extends A {
        int b = init("B field initializer");

        B() {
            // No explicit this(...) or super(...): the compiler inserts super()
            System.out.println("B() body");
        }
    }

    static class C extends B {
        int c = init("C field initializer");

        C() {
            super();
            System.out.println("C() body");
        }
    }

    static class NoDefault {
        NoDefault(int value) { }
    }

    // COMPILE ERROR: constructor NoDefault in class NoDefault cannot be applied to given types
    // (no accessible no-arg superclass constructor, so the implicit super() fails)
    // static class Broken extends NoDefault { }

    static int init(String text) {
        System.out.println(text);
        return 1;
    }

    public static void main(String[] args) {
        new C();
    }
}

// Output:
// A field initializer
// A() body
// B field initializer
// B() body
// C field initializer
// C() body
