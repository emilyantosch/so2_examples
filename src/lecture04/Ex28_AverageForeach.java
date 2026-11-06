/*
 * Lecture 4 – Task: Average (slides_004/main.typ:590)
 * Task: Use foreach to calculate the average of a non-empty `double[]`.
 *       Write a program that calls the method.
 */
package lecture04;

public class Ex28_AverageForeach {

    // Precondition: numbers is non-null and non-empty.
    static double average(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] a = {1.43, 2, .2, 6.32, 7.1, 8.1};
        System.out.println("Average = " + average(a));
    }
}

// Output:
// Average = 4.191666666666666
