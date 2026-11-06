/*
 * Lecture 4 – String Concatenation (slides_004/main.typ:114)
 * Question: What will this print?
 */
package lecture04;

public class Ex04_ConcatenationOrder {

    public static void main(String[] args) {
        int a = 20;
        int b = 22;
        System.out.println("Year: " + a + b);
        System.out.println(a + b + " (Year)");
    }
}

// Answer:
// Year: 2022
// 42 (Year)
// `+` is evaluated left to right: String + int is concatenation, int + int is addition.
// Fix the first line with parentheses: "Year: " + (a + b)
