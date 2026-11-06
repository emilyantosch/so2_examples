/*
 * Lecture 6 – Interfaces Can Extend Multiple Interfaces (slides_006/main.typ:199)
 * Demo: interface Interface3 extends Interface1, Interface2; ClassA implements Interface3.
 */
package lecture06;

public class Ex10_InterfaceInheritance {

    interface Interface1 {
        void method1();
    }

    interface Interface2 {
        void method2();
    }

    interface Interface3 extends Interface1, Interface2 { }

    static class ClassA implements Interface3 {
        // Implement all inherited abstract methods
        @Override
        public void method1() {
            System.out.println("method1()");
        }
        @Override
        public void method2() {
            System.out.println("method2()");
        }
    }

    public static void main(String[] args) {
        Interface3 ref = new ClassA();
        ref.method1();
        ref.method2();
        Interface1 ref1 = ref;   // ClassA is also an Interface1 and an Interface2
        ref1.method1();
    }
}
