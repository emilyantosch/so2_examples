/*
 * Lecture 2 – Scope of Variables (slides_002/main.typ:128)
 * Demo: A local variable's scope starts at its declaration and ends with its block.
 */
package lecture02;

public class Ex03_Scope {

    public static void main(String[] args) {
        int outer = 1;
        {
            int inner = 2;
            System.out.println("outer = " + outer + ", inner = " + inner);
        }
        System.out.println("outer = " + outer);
        // COMPILE ERROR: cannot find symbol inner (its block has ended)
        // System.out.println("inner = " + inner);
    }
}
