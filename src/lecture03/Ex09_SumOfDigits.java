/*
 * Lecture 3 – Methods: Examples (slides_003/main.typ:308)
 * Task: Calculate the digit sum of a non-negative integer.
 */
package lecture03;

public class Ex09_SumOfDigits {

    static class MathUtils {
        int sumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.sumOfDigits(0));
        System.out.println(math.sumOfDigits(2016));
    }
}

// Output:
// 0
// 9
