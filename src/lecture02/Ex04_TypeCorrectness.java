/*
 * Lecture 2 – Type Correctness (slides_002/main.typ:135)
 * Demo: Assignments must use compatible types.
 *       Java does not implicitly narrow a float to an int.
 */
package lecture02;

public class Ex04_TypeCorrectness {

    public static void main(String[] args) {
        float b = 3.5f;
        // COMPILE ERROR: incompatible types: possible lossy conversion from float to int
        // int a = b;
        int a = (int) b;  // explicit cast, fraction is discarded
        System.out.println(a);
    }
}
