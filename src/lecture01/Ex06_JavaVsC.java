/*
 * Lecture 1 – Java vs. C (slides_001/main.typ:292, C version in slides_001/code/first.c)
 * Task: Write these in C:
 *       - Sum the numbers 1 to n with a for loop.
 *       - Find the larger of two numbers with if.
 *       - Put that comparison in a getMax() function.
 * Here: the same code in Java, to show how familiar the syntax is.
 */
package lecture01;

public class Ex06_JavaVsC {

    static int sumNumbers(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Java arrays know their length and are indexed directly: no pointer arithmetic.
    static int getMax(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result < nums[i]) {
                result = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum 1..10: " + sumNumbers(10));
        System.out.println("Max of 4 and 8: " + getMax(4, 8));
        System.out.println("Max of {3, -2, 9, 5}: " + getMax(new int[]{3, -2, 9, 5}));
    }
}
