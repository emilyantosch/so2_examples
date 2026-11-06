/*
 * Lecture 3 – Overloading (slides_003/main.typ:511)
 * Demo: Same method name does not guarantee the same behavior.
 */
package lecture03;

public class Ex16_OverloadSurprise {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static short max(short a, short b) {
        System.out.println("Aaaarrrghhh!");
        return 7;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        short a = 1, b = 2;
        System.out.println(max(a, b));
    }
}

// Output:
// 2
// Aaaarrrghhh!
// 7
