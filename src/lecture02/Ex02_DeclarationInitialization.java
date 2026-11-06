/*
 * Lecture 2 – Declaration and Initialization (slides_002/main.typ:90, 96, 118)
 * Demo: Declare first, then assign the initial values with =.
 *       Declaration and initialization can be combined.
 *       Declare a local variable before use. Assign a value before reading it.
 */
package lecture02;

public class Ex02_DeclarationInitialization {

    public static void main(String[] args) {
        // Declaration
        int a;
        float b;
        char c;

        // COMPILE ERROR: variable a might not have been initialized
        // System.out.println(a);

        // Initialization
        a = 5;
        b = 3.5f;
        c = 'A';
        System.out.println(a + " " + b + " " + c);

        // Combined
        int x = 5;
        float y = 3.5f;
        char z = 'A';
        System.out.println(x + " " + y + " " + z);
    }
}
