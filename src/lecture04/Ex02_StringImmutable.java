/*
 * Lecture 4 – Strings Are Immutable (slides_004/main.typ:71)
 * Question: What will this print?
 */
package lecture04;

public class Ex02_StringImmutable {

    public static void main(String[] args) {
        String lena1 = new String("Lena");
        String lena2 = lena1;
        System.out.println(lena1 + " / " + lena2);
        System.out.println(lena1 == lena2);

        lena2 += " B.";
        System.out.println(lena1 + " / " + lena2);
        System.out.println(lena1 == lena2);
    }
}

// Answer:
// Lena / Lena
// true
// Lena / Lena B.
// false
// += creates a new String and reassigns lena2; the original "Lena" object is unchanged.
