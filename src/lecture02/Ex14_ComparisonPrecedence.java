/*
 * Lecture 2 – Comparison Operators (slides_002/main.typ:374)
 * Question: Do these expressions give the same result?
 */
package lecture02;

public class Ex14_ComparisonPrecedence {

    public static void main(String[] args) {
        int a = 7, b = 4;
        boolean parentheses = (a > b) == (a <= b);
        boolean priorities = a > b == a <= b;
        System.out.println(parentheses);
        System.out.println(priorities);
    }
}

// Answer: Yes, both print false. Relational operators (>, <=) bind before ==,
//         so both are true == false.
