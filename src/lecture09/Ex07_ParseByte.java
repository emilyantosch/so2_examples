/*
 * Lecture 9 – Parse a Typed Value (slides_009/main.typ:132)
 * Question: Predict the result for 127, 128 and Hamburg.
 */
package lecture09;

import java.util.Scanner;

public class Ex07_ParseByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a byte value: ");
        System.out.println("Entered: " + scanner.nextByte());
        scanner.close();
    }
}

// Answer:
// 127     -> "Entered: 127" (byte range is -128 ... 127)
// 128     -> InputMismatchException (out of range)
// Hamburg -> InputMismatchException (not a number)
// Other pairs: nextInt()/hasNextInt(), nextDouble()/hasNextDouble(), nextBoolean()/hasNextBoolean().
