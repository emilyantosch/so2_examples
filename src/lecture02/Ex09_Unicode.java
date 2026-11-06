/*
 * Lecture 2 – Character Set (slides_002/main.typ:229)
 * Demo: Java uses Unicode. Some characters need two UTF-16 code units.
 */
package lecture02;

public class Ex09_Unicode {

    public static void main(String[] args) {
        System.out.println("A");           // A, 1 char
        System.out.println("😀");     // 😀, 2 chars
        System.out.println("A".length());
        System.out.println("😀".length());
    }
}
