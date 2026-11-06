/*
 * Lecture 2 – Increment and Decrement (slides_002/main.typ:350)
 * Question: What does this print?
 */
package lecture02;

public class Ex13_IncrementDecrement {

    public static void main(String[] args) {
        int a = 1;
        System.out.println("++a : " + ++a);
        System.out.println("a   : " + a);
        System.out.println("a++ : " + a++);
        System.out.println("--a : " + --a);
        System.out.println("a-- : " + a--);
    }
}

// Answer:
// ++a : 2   (increment to 2, use 2)
// a   : 2
// a++ : 2   (use 2, then a = 3)
// --a : 2   (decrement to 2, use 2)
// a-- : 2   (use 2, then a = 1)
