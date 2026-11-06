/*
 * Lecture 5 – Same Name, Different Implementations (slides_005/main.typ:588)
 * Demo: Overloading (compiler selects by arguments) vs. overriding (runtime selects by object).
 *       Overloading cannot differ only by return type.
 */
package lecture05;

public class Ex20_OverloadingVsOverriding {

    static class MathFunctions {
        static int max(int a, int b) {
            return a > b ? a : b;
        }
        static int max(int a, int b, int c) {
            return max(max(a, b), c);
        }
        static double max(double a, double b) {
            return a > b ? a : b;
        }
        static double max(double[] values) {
            double result = values[0];
            for (double value : values) {
                result = max(result, value);
            }
            return result;
        }
        // COMPILE ERROR: method max(int,int) is already defined (differs only by return type)
        // static long max(int a, int b) { return a > b ? a : b; }
    }

    static class Person {
        @Override
        public String toString() {
            return "Person";
        }
    }

    static class Pilot extends Person {
        @Override
        public String toString() {
            return "Pilot";
        }
    }

    public static void main(String[] args) {
        System.out.println(MathFunctions.max(3, 7));
        System.out.println(MathFunctions.max(3, 7, 5));
        System.out.println(MathFunctions.max(2.5, 1.5));
        System.out.println(MathFunctions.max(new double[] {1.0, 9.5, 4.0}));

        Person person = new Pilot();
        System.out.println(person.toString());
    }
}
