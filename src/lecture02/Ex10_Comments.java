/*
 * Lecture 2 – Comments (slides_002/main.typ:251)
 * Question: How do line and block comments differ?
 */
package lecture02;

public class Ex10_Comments {

    public static void main(String[] args) {
        // A line comment ends at the line break.
        int distance = 42; // Distance between a and b

        /* A block comment can span
           several lines. */
        System.out.println(distance);
    }
}

// Answer: A line comment (//) ends at the line break.
//         A block comment (/* ... */) runs until */ and can span several lines.
