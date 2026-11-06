/*
 * Lecture 3 – Methods: Examples (slides_003/main.typ:274)
 * Task: Calculate the average of two floating-point numbers.
 */
package lecture03;
class MathUtils {
    double average(double a, double b) {
        return (a + b) / 2.0;
    }
}

public class Ex08_Average {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        double a1 = 3.5, a2 = 7;
        double mean = math.average(a1, a2);
        System.out.println(mean);
        System.out.println(math.average(1.5, 3.2));
    }
}

// Output:
// 5.25
// 2.35
