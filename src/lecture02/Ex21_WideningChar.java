/*
 * Lecture 2 – Implicit Type Conversion (slides_002/main.typ:488)
 * Question: Which lines compile?
 */
package lecture02;

public class Ex21_WideningChar {

    public static void main(String[] args) {
        char d = 'A';
        // COMPILE ERROR: incompatible types: possible lossy conversion from char to short
        //short e = d;
        int f = d;
        System.out.println(f);
    }
}

// Answer: Lines 1 and 3. char (0..65,535) and short (-32,768..32,767): neither range
//         contains the other, so char -> short needs a cast. char -> int is widening; f = 65.
