/*
 * Lecture 1 – Program execution in Java (slides_001/main.typ:276, 284)
 * Demo: Execution starts in the static main method. It creates objects and stores their
 *       references in variables. Objects can create other objects and call their methods.
 */
package lecture01;

public class Ex05_References {

    static class ObjectC {
        void work() {
            System.out.println("C is working");
        }
    }

    static class ObjectB {
        private final ObjectC c;

        ObjectB(ObjectC c) {
            this.c = c;
        }

        void work() {
            System.out.println("B is working");
            c.work();
        }
    }

    static class ObjectA {
        private final ObjectC c = new ObjectC();
        private final ObjectB b = new ObjectB(c);

        void work() {
            System.out.println("A is working");
            b.work();
        }
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        ObjectA a = new ObjectA();  // a holds a reference, not the object itself
        a.work();
        System.out.println("main returns, program ends");
    }
}
