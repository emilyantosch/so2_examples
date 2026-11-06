/*
 * Lecture 3 – Methods: Call-by-Value (slides_003/main.typ:365)
 * Demo: Java copies argument values into local parameter variables.
 */
package lecture03;

public class Ex11_CallByValue {

    static double square(double a) {
        a = a * a;
        return a;
    }

    public static void main(String[] args) {
        double b = 3.0;
        double result = square(b);
        System.out.println("b = " + b);           // unchanged: 3.0
        System.out.println("result = " + result); // 9.0
    }
}
