/*
 * Lecture 3 – Overloading (slides_003/main.typ:475, 488, 497)
 * Task: Write a method that returns the maximum of two integers.
 *       Add a method for two `double` values. Add a method for three integers.
 */
package lecture03;

public class Ex15_Overloading {

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // COMPILE ERROR: max(int,int) is already defined (only the return type differs)
    // static long max(int x, int y) { return x; }

    public static void main(String[] args) {
        System.out.println(max(3, 7));
        System.out.println(max(2.5, 1.5));
        System.out.println(max(4, 9, 2));
        System.out.println(max(3, 7.5)); // int widened to double -> max(double, double)
    }
}

// Output:
// 7
// 2.5
// 9
// 7.5
